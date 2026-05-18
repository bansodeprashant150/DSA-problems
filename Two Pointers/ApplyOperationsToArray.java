public class ApplyOperationsToArray {

    public int[] applyOperations(int[] nums) {

        int index = 0;
        int[] result = new int[nums.length];

        // apply operations
        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // move non-zero elements
        for(int j = 0; j < nums.length; j++) {

            if(nums[j] > 0) {
                result[index] = nums[j];
                index++;
            }
        }

        // fill remaining with zeros
        while(index < nums.length) {
            result[index] = 0;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1, 1, 0};

        ApplyOperationsToArray obj =
                new ApplyOperationsToArray();

        int[] arr = obj.applyOperations(nums);

        for(int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
