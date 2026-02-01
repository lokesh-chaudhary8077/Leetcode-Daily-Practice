// Last updated: 2/1/2026, 9:37:24 PM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int n = nums.length;
4        int min1 = Integer.MAX_VALUE;
5        int min2 = Integer.MAX_VALUE;
6        for(int i = 1;i < n;i++){
7            if(nums[i] < min1){
8                min2 = min1;
9                min1 = nums[i];
10            }
11            else if(nums[i] < min2 ){
12                min2 = nums[i];
13            }
14        }
15
16        return nums[0] + min1 + min2;
17    }
18}