

public class patterns {
public void pattern1(int n){


    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n=3;
        patterns obj=new patterns();
        obj.pattern1(n);
    }
}
