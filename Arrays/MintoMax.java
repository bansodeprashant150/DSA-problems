import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MintoMax {
    

    
    public int countNonMinimum(int[] nums) {
        // write your code here 
        
        int M=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<M){
                M=nums[i];
            }
        }    int count=0;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i]>M){
                    count++;
                }
            }
        
        return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();

        while(testcase-->0){

            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            MintoMax obj=new MintoMax();
            int result=obj.countNonMinimum(nums);
            System.out.println(result);
        }
       

        

        
    }
}

