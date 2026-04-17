class zerosfun{
    public int[] movezero(int[]nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }

        }

        while(index<nums.length){
            nums[index]=0;
            index++;
        }
        return nums;
    }
}
public class MoveZeroes {

    public static void main(String[] args) {
        int[]nums=new int[5];
        nums[0]=1;
        nums[1]=0;
        nums[2]=13;
        nums[3]=0;
        nums[4]=17;

        zerosfun obj=new zerosfun();
        int[] result=obj.movezero(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
