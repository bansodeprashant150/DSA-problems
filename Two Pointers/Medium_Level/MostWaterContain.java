public class MostWaterContain {

    public int maxArea(int[] height) {

        int max = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int breadth = right - left;

            int area = Math.min(height[left],
                                height[right]) * breadth;

            max = Math.max(max, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        MostWaterContain obj = new MostWaterContain();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = obj.maxArea(height);

        System.out.println("Maximum Area: " + result);
    }
}
