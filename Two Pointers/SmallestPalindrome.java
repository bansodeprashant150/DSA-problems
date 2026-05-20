public class SmallestPalindrome {

    public String makeSmallestPalindrome(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            // If characters are different
            if(arr[left] != arr[right]){

                // Keep smaller character
                if(arr[left] < arr[right]){
                    arr[right] = arr[left];
                }
                else{
                    arr[left] = arr[right];
                }
            }

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        SmallestPalindrome obj = new SmallestPalindrome();

        String result = obj.makeSmallestPalindrome("egcfe");

        System.out.println(result);
    }
}
