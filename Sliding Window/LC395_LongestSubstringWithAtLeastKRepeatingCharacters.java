public class LC395_LongestSubstringWithAtLeastKRepeatingCharacters {

    public int longestSubstring(String s, int k) {
        if (s == null || s.length() < k) {
            return 0;
        }

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {

                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        return s.length();
    }

    public static void main(String[] args) {
        LC395_LongestSubstringWithAtLeastKRepeatingCharacters solution =
                new LC395_LongestSubstringWithAtLeastKRepeatingCharacters();

        System.out.println(solution.longestSubstring("aaabb", 3));   // 3
        System.out.println(solution.longestSubstring("ababbc", 2));  // 5
        System.out.println(solution.longestSubstring("aaabbb", 3));  // 6
        System.out.println(solution.longestSubstring("ababacb", 3)); // 0
    }
}
