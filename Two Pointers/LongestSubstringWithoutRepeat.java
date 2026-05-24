import java.util.Arrays;

class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }

            charIndex[s.charAt(right)] = right;

            maxLength = Math.max(maxLength,
                                 right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeat obj =
                new LongestSubstringWithoutRepeat();

        String s = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println(
                "Longest Substring Length: " + result);
    }
}
