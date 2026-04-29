import java.util.Arrays;

public class cookies {
  
    public int findContentChildren(int[] g, int[] s) {
        int content=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        
        while(i<g.length&&j<s.length){
          if(s[j]>=g[i]){
            content++;
            i++;
            j++;
            }
            else{j++;}
            // i++;
            
          }
          return content;
          
        
    }
    public static void main(String[]args){
      int[]g={10,9,8,7};
      
      
      int[]s={5,6,7,8};
      cookies obj=new cookies();
      int result=obj.findContentChildren(g,s);
      System.out.println(result);
      }
}
