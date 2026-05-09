public class Sortparity {

    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];

        int index = 0;

        // first place even numbers
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        // then place odd numbers
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
    
    public static void main( String  [] args  ) {
     Sortparity obj= new Sortparity;
     int[] nums={2,5,9,4,1,8};
     int []result=obj.sortArrayByParity(nums);
     System.out.println(result);
      }
}