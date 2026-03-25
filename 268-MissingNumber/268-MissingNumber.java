// Last updated: 3/25/2026, 11:32:28 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int si = 0;
4        int n = 0;
5        while(si < nums.length){
6            if(nums[si] != 0){
7                int temp = nums[n];
8                nums[n] = nums[si];
9                nums[si] = temp;
10                n++;
11            }
12            si++;
13        }
14    }
15}