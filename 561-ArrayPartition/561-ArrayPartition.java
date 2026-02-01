// Last updated: 2/1/2026, 9:47:56 PM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int p = n/2;
6        int sum = 0;
7        for(int i = 0;i < n;i = i + 2){
8            sum += nums[i];
9        }
10        return sum;
11    }
12}