// Last updated: 3/25/2026, 9:44:01 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3      int sum = 0;
4      int max = 0;
5      for(int i = 0;i < accounts.length;i++){
6        for(int j = 0;j < accounts[0].length;j++){
7            sum += accounts[i][j];
8        }
9        max = Math.max(max,sum);
10        sum = 0;
11      }
12      return max;  
13    }
14}