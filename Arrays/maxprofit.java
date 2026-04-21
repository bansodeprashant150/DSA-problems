public class maxprofit {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            
            // calculate profit if sold today
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);

            // update minimum price
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }

     public static void main(String[] args) {
        int[] prices={7,5,12,45,8,2};
        maxprofit obj=new maxprofit();
        int result=obj.maxProfit(prices);
        System.out.println(result);
   
    }}
