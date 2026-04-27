class Reverse_Vowels {
    private boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(!isVowel(chars[left])){
                left++;
                }
            else if(!isVowel(chars[right])){right--;}
            if(isVowel(chars[left])&&isVowel(chars[right])){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }

            s=chars.toString();
        }
    return new String(chars);

    }
}
