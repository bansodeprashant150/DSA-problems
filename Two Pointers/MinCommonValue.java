import java.util.*;
public class MinCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
   
    int i=0;
    int j=0;
    while(i<nums1.length&&j<nums2.length){
      if(nums1[i]==nums2[j]){
        return nums1[i];}
        else if(nums1[i]>nums2[j]){
          j++;
          }
          else{
            i++;}
      }
      return -1;
    }
    public static void main(String[]args){
      int[]nums1={2,4};
      int[]nums2={1,2};
      MinCommonValue obj=new MinCommonValue();
      int result=obj.getCommon(nums1,nums2);
      System.out.println(result);
      }
}
