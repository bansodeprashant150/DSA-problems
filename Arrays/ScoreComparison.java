import java.util.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            
           int alice =0;
           int bob=0;
            for(int i=0;i<3;i++){
                if(a.get(i)>b.get(i)){
                    alice++;
                }
                else if(a.get(i)<b.get(i)){
                    bob++;
                }
            }
            
            List<Integer> result=new ArrayList<>();
            result.add(alice);
            result.add(bob);
            
            return result;
    }

}


public class ScoreComparison {
    
   public static void main(String[] args) {
     List<Integer> a= new ArrayList<>();
    List<Integer> b=new ArrayList<>();

    a.add(90);
    a.add(40);
    a.add(60);
    b.add(52);
    b.add(33);
    b.add(58);
    List<Integer> result=Result.compareTriplets(a,b);
    System.out.println(result.get(0) +" "+result.get(1));
   }
}
