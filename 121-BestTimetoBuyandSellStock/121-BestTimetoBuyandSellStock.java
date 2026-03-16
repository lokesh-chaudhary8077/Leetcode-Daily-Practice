// Last updated: 3/16/2026, 2:11:19 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3       int profit = 0;
4       int max = 0;
5       int buy = prices[0];
6       for(int i = 1;i < prices.length;i++){
7        if(buy > prices[i]){
8            buy = prices[i];
9        }
10        else{
11            if(prices[i] - buy > 0){
12                profit = prices[i] - buy;
13                max = Math.max(max,profit);
14            } 
15        }
16       } 
17       return max;
18    }
19}