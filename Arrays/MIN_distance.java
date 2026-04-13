class MIN_distance {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int distance=Math.abs(i-start);
                minDis=Math.min(minDis,distance);
            }
        }
        return minDis;
    }
}
