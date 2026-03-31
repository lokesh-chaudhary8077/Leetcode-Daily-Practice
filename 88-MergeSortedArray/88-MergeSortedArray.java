// Last updated: 3/31/2026, 1:40:46 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int []arr = new int[n];
5        for(int i = 0;i < n;i++){
6            arr[i] = nums[i] * nums[i];
7        }
8        Arrays.sort(arr);
9        return arr;
10    }
11}