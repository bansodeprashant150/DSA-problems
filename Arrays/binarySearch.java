class searchfun {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;

            }
            else if(nums[mid]<target){
                left=mid+1;
            }

            else{
                right=mid-1;
            }
        }

        return left;
    }
}

public class binarySearch {

    public static void main(String[] args) {
        int[]nums={1,5,10,12,15,20};
        int target=11;
        searchfun obj=new searchfun();
        int result=obj.searchInsert(nums, target);
        System.out.println(result);

    }
}
