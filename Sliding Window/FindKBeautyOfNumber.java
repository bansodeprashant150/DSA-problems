public class FindKBeautyOfNumber {

    public static int divisorSubstrings(int num, int k) {
        String number = String.valueOf(num);
        int count = 0;

        for (int i = 0; i <= number.length() - k; i++) {
            String substring = number.substring(i, i + k);
            int value = Integer.parseInt(substring);

            if (value != 0 && num % value == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 240;
        int k = 2;

        int result = divisorSubstrings(num, k);

        System.out.println("Number: " + num);
        System.out.println("K: " + k);
        System.out.println("K-Beauty: " + result);
    }
}
