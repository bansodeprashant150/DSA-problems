import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> result=new ArrayList<>();
    
    for(int i=a.size()-1;i>=0;i--){
    result.add(a.get(i));
    }
    return result;
    }

}

public class Reverse_array {
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();

       List<Integer> arr=new ArrayList<>();
       for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
       }

       List<Integer>result=Result.reverseArray(arr);
       for(int num:result){
        System.out.print(num+" ");
       }
       sc.close();
    }
}
