public class findSingleinpairs {
public int findelement(int[] nums){
    int result=0;
    for(int num:nums){
        result^=num;
    }
    return result;
    
}
public static void main(String[] args) {
    int[] nums={1,3,4,2,4,3,2};
    findSingleinpairs obj=new findSingleinpairs();
    int result=obj.findelement(nums);
    System.out.println(result);
}
}
