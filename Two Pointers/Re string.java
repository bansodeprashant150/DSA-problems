public class Solution{
  
  public String revstring(String s, int k){
    int i =0;
    char[] arr=s.toCharArray();
    while(i<s.length()){
      int left=i;
      int right=Math.min(i+k-1,arr.length-1);
      
      while(left<right){
char temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left++;
right--;

      }
i+=2*k;
    }
    return new String(arr);
  }
  
  public static void main (String[] args){
    
    String s="abcdefg";
    int k=3;
    
    Solution obj= new Solution();
    String result=obj.revstring(s, k);
    System.out.println(result);
  }
}