class LongestPalindromeMed {

    public String longestPalindrome(String s) {

        int n = s.length();
        String res = "";

        for (int i = 0; i < n; i++) {

            int left = i;
            int right = i;

            // Odd palindrome
            while (left >= 0 && right < n &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            String temp = s.substring(left + 1, right);

            if (temp.length() > res.length()) {
                res = temp;
            }

            // Even palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < n &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            temp = s.substring(left + 1, right);

            if (temp.length() > res.length()) {
                res = temp;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        LongestPalindromeMed obj = new LongestPalindromeMed();

        String s = "babad";

        String result = obj.longestPalindrome(s);

        System.out.println("Longest Palindrome: " + result);
    }
}
