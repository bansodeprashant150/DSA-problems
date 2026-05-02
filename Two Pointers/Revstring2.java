 public class Revstring2{
     
     public String rev (String s){
     String[] words=s.split(" ");
     StringBuilder ans= new StringBuilder();
     
     for(int i=0;i<words.length;i++){
              StringBuilder temp= new StringBuilder(words[i]);
              ans.append(temp.reverse());
              
              if(i!=words.length-1){
                  ans.append(" " );}
         }
         
         return ans.toString();
     }
     
     public static void main (String[]args){
         String s="Let's take LeetCode contest";
         Revstring2 obj=new Revstring2;
         String result =obj.rev(s);
         System.out.println(result);
         }}