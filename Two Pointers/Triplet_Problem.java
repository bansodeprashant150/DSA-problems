import java.util.HashSet;

class Triplet_Problem {

    public int arithmeticTriplets(int[] nums, int diff) {

        HashSet<Integer> set = new HashSet<>();

        // store all elements
        for(int num : nums) {
            set.add(num);
        }

        int count = 0;

        // check triplets
        for(int num : nums) {

            if(set.contains(num + diff) &&
               set.contains(num + 2 * diff)) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;

        Triplet_Problem obj = new Triplet_Problem();

        int result = obj.arithmeticTriplets(nums, diff);

        System.out.println(result);
    }
}
