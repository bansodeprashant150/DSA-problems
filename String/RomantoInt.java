import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int total=0;
        int prev=0;

        for(int i=s.length()-1;i>=0;i--){
            int curr=value(s.charAt(i));
            if(curr<prev){
                total-=curr;
            }

            else{
                total+=curr;
            }
            prev=curr;
        }

        return total;
    }


    public int value(char C){
        if(C=='I')return 1;
        if(C=='V')return 5;
        if(C=='X')return 10;
        if(C=='L')return 50;
        if(C=='C')return 100;
        if(C=='D')return 500;
        return 1000;
    }
}
public class RomantoInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Solution obj=new Solution();
        int result=obj.romanToInt(s);

        System.out.println(result);
    }
}
