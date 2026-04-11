public class xorProblem {
    public int singleNumber(int[] nums) {
        // write your code here\
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
    int[]nums={2,3,4,5,2,3,4};

    xorProblem obj=new xorProblem();
    int result=obj.singleNumber(nums);
    System.out.println(result);
    }
}

