public class Arraysum{
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}