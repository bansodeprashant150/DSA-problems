
import java.util.*;
public class SummaryRanges {

    public List<String> findSummaryRange(int nums[]){
        List<String> result=new ArrayList<>();
    
        if(nums.length==0)  return result;

        int start=nums[0];

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1|| nums[i]+1!=nums[i+1]){
            if(start==nums[i]){
                result.add(String.valueOf(start));
            }
            else{
                result.add(start+"->"+nums[i]);
            }

            if(i!=nums.length-1){
                start=nums[i+1];
            }
        }}
        return result;


    }

    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        SummaryRanges obj=new SummaryRanges();
        List<String> result=obj.findSummaryRange(nums);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
