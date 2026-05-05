class Solution{
  
  public boolean backspace (String s, String t){
   StringBuilder sb1=new StringBuilder();
  StringBuilder sb2=new StringBuilder();

int i=0;
int j=0;

while(i<s.length()){
if(s.charAt(i)=='#'){
if(sb1.length()>0){
sb1.deleteCharAt(sb1.length()-1);
}
}
else{
  sb1.append(s.charAt(i));}i++;}
  while(j<t.length()){
if(t.charAt(j)=='#'){
if(sb2.length()>0){
sb2.deleteCharAt(sb2.length()-1);
}
}else{  sb2.append(t.charAt(j)); }
j++;
}
  return sb1.toString().equals(sb2.toString());
  
}

}
  

public class BackspaceQ {
  public static void main(String[] args) {
   String s="ab##";
   String t="c#d#";
   
   Solution obj=new Solution();
   boolean result=obj.backspace(s,t);
   System.out.println(result);
  }
}