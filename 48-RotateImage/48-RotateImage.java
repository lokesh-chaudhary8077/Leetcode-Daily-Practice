// Last updated: 1/30/2026, 10:09:48 PM
1class Solution {
2    public void rotate(int[][] nums) {
3        int n = nums.length;
4        for (int i = 0; i < n; i++) {
5            for (int j = i; j < n; j++) {
6                if (i == j) {
7                    continue;
8                } else {
9                    int temp = nums[i][j];
10                    nums[i][j] = nums[j][i];
11                    nums[j][i] = temp;
12                }
13            }
14        }
15        for (int i = 0; i < n; i++) {
16            for (int j = 0; j < n/2; j++) {
17                int temp = nums[i][j];
18                nums[i][j] = nums[i][n-1-j];
19                nums[i][n-1-j] = temp;
20            }
21        }
22    }
23}