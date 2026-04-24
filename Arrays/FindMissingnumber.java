import java.util.Arrays;

public class FindMissingnumber {

    public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor^=i ^nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums={0,2};
        FindMissingnumber obj=new FindMissingnumber();
        int result=obj.missingNumber(nums);
        System.out.println(result);
    }
}
