import java.util.HashSet;

public class LargestPositiveWithNegative {

    public int findMaxK(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int max = -1;

        for(int num : nums) {

            if(num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 2, -3, 3};

        LargestPositiveWithNegative obj =
                new LargestPositiveWithNegative();

        int result = obj.findMaxK(nums);

        System.out.println(result);
    }
}
