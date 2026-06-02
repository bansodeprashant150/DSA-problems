import java.util.HashMap;

public class Harmonius {

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxlen = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxlen = Math.max(maxlen,
                        map.get(key) + map.get(key + 1));
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        Harmonius sol = new Harmonius();

        int result = sol.findLHS(nums);

        System.out.println("Longest Harmonious Subsequence Length = " + result);
    }
}
