public class Long_press {
    public boolean Longpressed(String name, String typed){
        int i=0;
        int j=0;
        while(j<typed.length()){
            if(i<name.length()&& name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }
            else{
                return false;
            }
        }
        return i==name.length();
    }

    public static void main(String[] args) {
        String name="alexa";
        String typed="aaleexxxx";
        Long_press obj=new Long_press();
        boolean result=obj.Longpressed(name, typed);
        System.out.println(result);
    }
}
