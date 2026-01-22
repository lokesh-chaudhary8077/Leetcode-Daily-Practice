// Last updated: 1/22/2026, 11:47:28 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3    if (k <= 1) return 0;
4      int si = 0;
5      int pd = 1;
6      int ans = 0;
7      for(int ei = 0;ei < nums.length;ei++){
8        pd *= nums[ei];
9        while(pd >= k){
10            pd /= nums[si];
11            si++;
12        }
13        ans += ei - si + 1;
14      } 
15      return ans; 
16    }
17}