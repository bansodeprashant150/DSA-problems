public class LongestOddEven {
    public int longestAlternatingSubarray(int[] nums, int threshold) {

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > threshold) {
                // Cannot be part of any valid subarray
                count = 0;
            }
            else if (count == 0) {
                // Start a new subarray only if current element is even
                if (nums[i] % 2 == 0) {
                    count = 1;
                    maxLength = Math.max(maxLength, count);
                }
            }
            else {
                // Check if parity alternates
                if (nums[i] % 2 != nums[i - 1] % 2) {
                    count++;
                    maxLength = Math.max(maxLength, count);
                } else {
                    // Restart only if current element is even
                    if (nums[i] % 2 == 0) {
                        count = 1;
                        maxLength = Math.max(maxLength, count);
                    } else {
                        count = 0;
                    }
                }
            }
        }

        return maxLength;
    }
    
    public static void main(String[] args) {
        int[] nums={3,2,5,4};
        int threshold=5;
        LongestOddEven obj=new LongestOddEven();
        int result=obj.longestAlternatingSubarray(nums, threshold);
        System.out.println(result);
      }
}