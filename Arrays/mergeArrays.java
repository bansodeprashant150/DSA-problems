import java.util.Arrays;

class InnermergeArrays {
public void function(int[]nums1,int[]nums2,int m,int n ){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }

            k--;
        }
        while (j>=0) {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
}
    
}

public class mergeArrays {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[]nums1=new int[m+n];
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;

        int[] nums2=new int[n];
        nums2[0]=5;
        nums2[1]=6;
        nums2[2]=7;

        InnermergeArrays obj=new InnermergeArrays();
        obj.function(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }
    
}
