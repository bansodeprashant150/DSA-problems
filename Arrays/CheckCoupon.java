import java.util.Scanner;
public class CheckCoupon {
public String coupon(int n,int x, int y, int [] prices){


    int original_sum=0;
    int discount_sum=0;
    for(int i=0;i<n;i++){
        original_sum+=prices[i];

        if(prices[i]>y){
            discount_sum+=(prices[i]-y);
        }
        else{
            discount_sum+=0;
        }

        
    }
    if(original_sum>discount_sum+x){
            return " Coupon";
        }
        else{
            return "NO Coupon";
        }
}


    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0 ){
            int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();

        }
        
        CheckCoupon ch=new CheckCoupon();
        String result=ch.coupon(n,x,y,prices);
        System.out.println(result);

    }
        sc.close();
    }
}
