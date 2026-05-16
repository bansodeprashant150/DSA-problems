public class prefixCheck {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[]words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
          if(words[i].startsWith(searchWord)){
            return i+1;}
          }
          return -1;
    }
    public static void main(String[] args) {
        String sentence="this problem is an easy problem";
        String searchWord="pro";
        prefixCheck obj=new prefixCheck();
        int result=obj.isPrefixOfWord(sentence, searchWord);
        System.out.println(result);
    }
}
