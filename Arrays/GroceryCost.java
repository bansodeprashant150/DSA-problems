import java.util.Scanner;

public class GroceryCost {
    public int compute(int n, int x, int[] a, int[] b) {
        int cost=0;
        
        for(int i=0;i<n;i++){
            if(a[i]>=x){
                cost+=b[i];
            }
        }
        return cost;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[]a=new int[n];
            int[]b=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                b[j]=sc.nextInt();
            }

            GroceryCost gc= new GroceryCost();
            int result=gc.compute(n, x, a, b);
            System.out.println(result);

        }
            sc.close();
    }
}
