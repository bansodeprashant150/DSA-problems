public class MaximumStrongPairXOR {

    public static int maximumStrongPairXor(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    int xor = nums[i] ^ nums[j];
                    ans = Math.max(ans, xor);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int result = maximumStrongPairXor(nums);

        System.out.println("Maximum Strong Pair XOR: " + result);
    }
}
