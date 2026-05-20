public class fortCapture {
    public int fortscalculations(int[] forts){
        int max=0;
        int prev=-1;
        for(int i=0;i<forts.length;i++){
            if(forts[i]!=0){
                if(prev!=-1&&forts[i]!=forts[prev]){
                    
                    max=Math.max(max,i-prev-1);

                        
                }
                prev=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] forts={1,0,0,-1,0,0,0,0,1};
        fortCapture obj= new fortCapture();
        int result=obj.fortscalculations(forts);
        System.out.println(result);
    }
}
