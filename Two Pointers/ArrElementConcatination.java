import java.util.*;
public class ArrElementConcatination {
    public long findTheArrayConcVal(int[] nums) {
        long conc=0;
        int left=0;
        int right=nums.length-1;
     
          while(left<right){
            int result=Integer.parseInt(""+nums[left]+nums[right]);
            conc+=result;
            left++;
            right--;
            }
               if(left==right){
          conc+=nums[left];}
            return conc;
    }
      
    
    public static void main(String[]args){
      int[]nums={5,14,13,8,12};
     
      ArrElementConcatination obj=new ArrElementConcatination();
      long result=obj.findTheArrayConcVal(nums);
      System.out.println(result);
      }
}
