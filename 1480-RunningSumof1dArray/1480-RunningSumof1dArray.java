// Last updated: 3/25/2026, 10:54:43 PM
1class Solution {
2    public int[] buildArray(int[] nums) {
3      int arr[] = new int[nums.length];
4      for(int i = 0;i < nums.length;i++){
5        arr[i] = nums[nums[i]];
6      }  
7      return arr;
8    }
9}