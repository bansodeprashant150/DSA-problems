class func_class {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class IndexofString{
public static void main(String []args){
String haystack="opiuyleetcodeforleet";
String needle="leet";

func_class obj=new func_class();
int result=obj.strStr(haystack,needle);
System.out.println(result);
}
}
