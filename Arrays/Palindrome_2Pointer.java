public class Palindrome_2Pointer {

    public boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        boolean flag=true;
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            
    
        }

        String clean=sb.toString();
        int left=0; int right=clean.length()-1;

        while(left<right){


            if(clean.charAt(left)!=clean.charAt(right)){
                return false;
            }
            left++;
            right--;
            
            
        }
            return true;
        
    }
    public static void main(String[] args) {
        String s="madam";
        Palindrome_2Pointer obj=new Palindrome_2Pointer();
        boolean result=obj.isPalindrome(s);
        System.out.println(result);
    }

}
