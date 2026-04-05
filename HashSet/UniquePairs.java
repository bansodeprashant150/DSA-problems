package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<n;i++){

            String pair=sc.nextLine();
            set.add(pair);
            System.out.println(set.size());

        }

        
    }
}
