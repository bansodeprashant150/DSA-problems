public class MinimumSubArrayLength {
    

   
    public int minimumSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        
        for(int left=0;left<nums.length;left++){
          int currentOr=0;
            for (int right=left;right<nums.length;right++){
                currentOr|=nums[right];
                
                if(currentOr>=k){
                  min=Math.min(min,right-left+1);
                  }
            }
        }
        if(min==Integer.MAX_VALUE){
          return -1;}
          else return min;
    }
    
    public static void main(String[] args) {
        int[] nums={1,12,2,5};
        int k=43;
        MinimumSubArrayLength obj=new MinimumSubArrayLength();
        int result=obj.minimumSubarrayLength(nums, k);
        System.out.println(result);
      }
}

