// Last updated: 3/25/2026, 9:48:20 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3      int sum = 0;
4      int max = 0;
5      for(int i = 0;i < accounts.length;i++){
6        sum = 0;
7        for(int j = 0;j < accounts[0].length;j++){
8            sum += accounts[i][j];
9        }
10        max = Math.max(max,sum);
11        
12      }
13      return max;  
14    }
15}