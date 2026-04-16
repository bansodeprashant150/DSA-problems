class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
            }


}

public class UniqueNumbers{
    public static void main(String[]args){
int[] nums={0,0,1,1,2,3,3,4,5,5};

Solution obj=new Solution();
int result=obj.removeDuplicates(nums);

System.out.println(result);
}}
