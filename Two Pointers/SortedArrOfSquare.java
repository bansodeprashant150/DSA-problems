public class SortedArrOfSquare {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }
public static void main(String []args){
int[]nums="-4,-1,0,3,10";
SortedArrOfSquare obj=new SortedArrOfSquare();
int[]result=obj.sortedSquares(nums);

for(int num:result){
System.out.print(num+" ");
}
}
}
