// Last updated: 3/25/2026, 9:36:47 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3     int arr[] = new int[nums.length];
4     int sum = 0;
5     for(int i = 0;i < nums.length;i++){
6        sum += nums[i]; 
7        arr[i] = sum;
8     }
9     return arr;   
10    }
11}