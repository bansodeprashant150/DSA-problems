import java.util.Scanner;

public class Sqroot {
    public int findsqroot(int x){
        if(x==0||x==1) return x;
        int left=1;
        int right=x;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long) mid*mid==x) return mid;
            if((long)mid*mid<x){
                ans=mid;
                left=mid+1;
            }

            else{
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        Sqroot obj=new Sqroot();
        int result=obj.findsqroot(x);
        System.out.println(result);
    }
}
