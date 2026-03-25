// Last updated: 3/25/2026, 11:54:47 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int arr[]  = new int[2*n];
4        int idx = 0;
5        for(int i = 0;i < n;i++){
6            arr[idx] = nums[i]; 
7            arr[idx+1] = nums[i + n];
8            idx = idx + 2;
9        }
10        return arr;
11    }
12}