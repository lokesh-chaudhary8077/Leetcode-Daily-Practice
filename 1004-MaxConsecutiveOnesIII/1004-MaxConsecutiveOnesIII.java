// Last updated: 1/20/2026, 10:50:29 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int zero = 0;
5        int max = 0;
6        for(int i = 0;i < nums.length;i++){
7            if(nums[i] == 0){
8                zero++;
9            }
10            while(zero>k){
11                if(nums[left] == 0){
12                    zero--;
13                }
14                left++;
15            }
16            max= Math.max(max,i-left+1);
17        }
18        return max;
19    }
20}