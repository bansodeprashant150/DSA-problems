public class removepalindromeSequence {
    public int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return 2;
            }
            else{
              left++;
              right--;}
            
         
        }
        
        return 1;
       
    }
    public static void main(String[] args) {
        String s="baabb";
        removepalindromeSequence obj= new removepalindromeSequence();
        int result=obj.removePalindromeSub(s);
        System.out.println(result);
    }

}
