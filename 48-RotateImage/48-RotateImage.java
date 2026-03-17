// Last updated: 3/17/2026, 11:34:10 PM
1class Solution {
2    public void rotate(int[][] nums) {
3      int n = nums.length;
4      for(int i = 0;i < n;i++){
5        for(int j = i;j < n;j++){
6            int temp = nums[i][j];
7            nums[i][j] = nums[j][i];
8            nums[j][i] = temp;
9        }
10      }
11      for(int i = 0;i < n;i++){
12        for(int j = 0;j < n/2;j++){
13            int temp = nums[i][n-1-j];
14            nums[i][n-1-j] = nums[i][j];
15            nums[i][j] = temp;
16        }
17      }
18    }
19}