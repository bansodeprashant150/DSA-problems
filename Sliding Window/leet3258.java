public class leet3258{

        public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        int left=0;
        int right=0;
        int zero=0;
        int one=0;
        while(right<s.length()){
            if(s.charAt(right)=='0'){
                zero++;
            }
            else{
                one++;
            }

            while(zero>k && one>k){
                if(s.charAt(left)==0){
                    zero--;
                }
                else{
                    one--;
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }


    public static void main(String[] args) {
        String s="10101";
        int k=1;
        leet3258 obj= new leet3258();
        int result=obj.countKConstraintSubstrings(s, k);
        System.out.println(result);
    }
}