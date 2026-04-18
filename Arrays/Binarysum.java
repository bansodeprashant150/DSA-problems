class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);  // store current bit
            carry = sum / 2;        // update carry
        }

        // if carry remains
        if (carry != 0) {
            result.append(carry);
        }

        // reverse because we added from LSB → MSB
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String a = "1011";
        String b = "1101";

        System.out.println(obj.addBinary(a, b)); // Output: 11000
    }
}