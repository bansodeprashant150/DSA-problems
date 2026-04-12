import java.util.Scanner;

public class NonDecreasingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            boolean issorted=true;
            for(int i=0;i<n-1;i++){
                if(d[i]>d[i+1]){
                    issorted=false;
                    break;
                }
            }
            
            if(issorted){
                System.out.println("Yes");
            }
            else{System.out.println("No");}
    }
}}
