// Last updated: 1/16/2026, 3:08:12 PM
1class Solution {
2    public int maxSubArray(int[] arr) {
3       int sum = 0;
4       int maxSum = Integer.MIN_VALUE;
5       for(int i = 0;i < arr.length;i++) {
6        sum += arr[i];
7        maxSum = Math.max(maxSum,sum);
8        if(sum < 0){
9            sum = 0;
10        }
11        
12       }
13       return maxSum;
14    }
15}