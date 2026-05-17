public class reversePrefix {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                int left=0;
                int right=i;
                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
                
                return new String(arr);
            }
        } return word;
    }
    public static void main(String[] args) {
        String word="abcdefd";
        char ch='z';
        reversePrefix obj=new reversePrefix();
        String s=obj.reversePrefix(word, ch);
        System.out.println(s);
    }
}
