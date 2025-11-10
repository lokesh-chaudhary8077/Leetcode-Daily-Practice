// Last updated: 11/10/2025, 8:42:47 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            } else {
                profit = Math.max(profit,prices[i] - buy);
            }
        }
        return profit;
    }
}