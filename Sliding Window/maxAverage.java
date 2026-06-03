public class maxAverage {
    public double findMaxAverage(int[] nums, int k) {
     int n=nums.length;
     int sum=0;
     for(int i=0;i<k;i++){
        sum+=nums[i];
     }   

     int maxSum=sum;
     for(int i=k;i<n;i++){
        sum=sum-nums[i-k]+nums[i];
        if(sum>maxSum){
            maxSum=sum;
        }
     }
     return (double)maxSum/k;
    }

public static void main(String []args){
int[]nums={1,12,-5,-6,50,3};
int k=4;
maxAverage obj=new maxAverage();
double result=obj.findMaxAverage( nums, k);
System.out.println(result);
}
}
