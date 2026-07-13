class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int profit = 0;
        if(prices.length == 1){
            return profit;
        }
        int min = prices[0];
        while(s < prices.length){
            profit = Math.max(profit, prices[s] - min);
            min = Math.min(min, prices[s]);
            s++;
        }   
        return profit;
    }
}
