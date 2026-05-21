import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PairCounter {

    public int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;

        int count = 0;

        while (left < right) {

            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {

                count += (right - left);

                left++;
            } 
            else {
                right--;
            }
        }

        return count;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int target = 2;

        PairCounter pc = new PairCounter();

        int result = pc.countPairs(nums, target);

        System.out.println("Valid Pairs Count: " + result);
    }
}
