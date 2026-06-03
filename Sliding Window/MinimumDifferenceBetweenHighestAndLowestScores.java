import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestScores {

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int difference = nums[i + k - 1] - nums[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        int k = 2;

        int result = minimumDifference(nums, k);

        System.out.println("Minimum Difference: " + result);
    }
}
