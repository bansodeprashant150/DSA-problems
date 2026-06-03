public class CountGoodSubstrings {

    public static int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            char third = s.charAt(i + 2);

            if (first != second &&
                first != third &&
                second != third) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "xyzzaz";
        String s2 = "aababcabc";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + countGoodSubstrings(s1));

        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Output: " + countGoodSubstrings(s2));
    }
}
