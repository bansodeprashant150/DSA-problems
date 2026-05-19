import java.util.Arrays;
import java.util.HashSet;

public class DistinctAvg {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set=new HashSet <>();
      
        Arrays.sort(nums);
        int min =0;
        int max=nums.length-1;
        while(min<max){
          if(nums[min]==nums[max]){
            set.add((double)nums[min]);
            min++;
            max--;
            }
            else{
            double avg=(nums[min]+nums[max])/2.0;
            set.add(avg);
            min++;
            max--;}
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[]nums={1,1,1,1};
        DistinctAvg obj=new DistinctAvg();
            int result=obj.distinctAverages(nums);
            System.out.println(result);
    }
}
