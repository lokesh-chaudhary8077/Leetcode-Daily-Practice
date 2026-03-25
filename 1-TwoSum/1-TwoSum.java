// Last updated: 3/25/2026, 9:12:45 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int []arr = {-1,-1};
4        int sum = 0;
5        for(int i = 0;i < nums.length;i++){
6            for(int j = i+1;j<nums.length;j++){
7                if(nums[i] + nums[j] == target){
8                    arr[0] = i;
9                    arr[1] = j;
10                }
11            }
12        }
13        return arr;
14    }
15}