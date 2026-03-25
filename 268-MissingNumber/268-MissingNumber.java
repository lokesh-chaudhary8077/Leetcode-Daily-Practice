// Last updated: 3/25/2026, 11:13:18 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int total = n * (n+1)/2;
5        int sum = 0;
6        for(int i = 0;i < n;i++){
7            sum += nums[i];
8        }
9        return total-sum;
10    }
11}