    import java.util.ArrayList;
    import java.util.List;

    public class k_distant {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            List<Integer> list=new ArrayList<>();
            boolean[] visited=new boolean[nums.length];

            for(int i=0;i<nums.length;i++){
                if(nums[i]==key){
                    int start=Math.max(0, i-k);
                    int end=Math.min(nums.length-1,i+k);
                    for(int j=start;j<=end;j++){
                        if(!visited[j]){
                            list.add(j);
                            visited[j] =true;
                        }

                    }
                }
            }
            return list;
        }
        public static void main(String[] args) {
            int []nums={3,4,9,1,3,9,5};
            int key=9;
            int k=1;
            k_distant obj=new k_distant();
            List<Integer>result=obj.findKDistantIndices(nums, key, k);
            System.out.println(result);
        }
    }
