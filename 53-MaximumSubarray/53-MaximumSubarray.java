// Last updated: 3/16/2026, 2:02:23 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0;
4        int maxSum = Integer.MIN_VALUE;
5        for(int i = 0;i < nums.length;i++){
6            sum+=nums[i];
7            maxSum = Math.max(maxSum,sum);
8            if(sum < 0){
9                sum = 0;
10            }
11        }
12        return maxSum;
13    }
14}