public class PrefixMatch {

    public boolean isPrefixString(String s, String[] words) {

        int pointer = 0;
        int charcheck = 0;

        for(int i = 0; i < s.length(); i++) {

            // safety check
            if(pointer >= words.length) {
                return false;
            }

            // mismatch
            if(s.charAt(i) != words[pointer].charAt(charcheck)) {
                return false;
            }

            // move inside current word
            charcheck++;

            // current word completed
            if(charcheck == words[pointer].length()) {
                pointer++;
                charcheck = 0;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "iloveleetcode";

        String[] words = {
            "i",
            "love",
            "leetcode",
            "apples"
        };

        PrefixMatch obj = new PrefixMatch();

        boolean result = obj.isPrefixString(s, words);

        System.out.println(result);
    }
}
