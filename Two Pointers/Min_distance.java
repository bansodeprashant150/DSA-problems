public class Min_distance {

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        Solution obj = new Solution();

        int[] result = obj.shortestToChar(s, c);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int [] arr=new int[n];

        int last=-Integer.MAX_VALUE/2;

        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                last=i;
            }
            arr[i]=i-last;
        }
        
        for(int i= n-1;i>=0;i--){
        
          if(s.charAt(i)==c){
            last=i;
            }
            
            arr[i]=Math.min(arr[i],last-i);
          }
          
          return arr;
    }
}
