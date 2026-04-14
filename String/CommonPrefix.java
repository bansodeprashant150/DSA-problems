class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }

        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);

            for(int j=1;j<strs.length;j++){

                if(i>=strs[j].length()||strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }
}

public class CommonPrefix{
    public static void main(String[] args) {
        String[]strs=new String[3];
        strs[0]="flower";
        strs[1]="flow";
        strs[2]="flight";

        Solution obj=new Solution();
        String result=obj.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
