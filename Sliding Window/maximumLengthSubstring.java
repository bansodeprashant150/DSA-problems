import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {

    public static int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.get(currentChar) > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "bcbbbcba";
        int result = maximumLengthSubstring(s);

        System.out.println("Maximum Length Substring: " + result);
    }
}
