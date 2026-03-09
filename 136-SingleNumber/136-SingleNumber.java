// Last updated: 3/9/2026, 8:50:20 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = nums[0];
4        for(int i = 1;i < nums.length;i++){
5            ans = ans ^ nums[i];
6        }
7        return ans;
8    }
9}