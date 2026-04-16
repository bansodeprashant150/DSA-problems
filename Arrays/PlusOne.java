class plusonefun {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
}

public class PlusOne {

    public static void main(String[] args) {
        int []digits=new int[3];
        digits[0]=1;
        digits[1]=2;
        digits[2]=9;
plusonefun obj=new plusonefun();
int[] arr=obj.plusOne(digits);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
}


    }
}
