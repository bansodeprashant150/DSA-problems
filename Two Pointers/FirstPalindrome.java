import java.util.*;
public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for(String str:words){
          StringBuilder sb=new StringBuilder(str).reverse();
          if(str.equals(sb.toString())){
            return str;
            }
          }
          return "";
    }
    public static void main(String[]args){
      String[]words={"abc","car","ada","racecar","cool"};
      FirstPalindrome obj=new FirstPalindrome();
      String result=obj.firstPalindrome(words);
      System.out.println(result);
      }
}
