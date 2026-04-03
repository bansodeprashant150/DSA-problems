import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayQueries {

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<d;j++){
                
                rows.add(sc.nextInt());
            }

            arr.add(rows);

            
        }

        int q=sc.nextInt();

            for(int i=0;i<q;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();


                try{
                    System.out.println(arr.get(x-1).get(y-1));
                }
                catch(Exception e){
                    System.out.println("Error");
                }
            }
    }
}
