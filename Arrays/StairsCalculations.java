public class StairsCalculations {
    public int steps(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        int prev1=2;
        int prev2=1;
        for(int i=3;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n=10;
        StairsCalculations ocj=new StairsCalculations();
        int result=ocj.steps(n);
        System.out.println(result);
    }
}
