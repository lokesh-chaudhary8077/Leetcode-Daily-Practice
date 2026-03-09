// Last updated: 3/9/2026, 8:45:20 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3      int count = 0;
4      int max = 0;
5      for(int i = 0;i < nums.length;i++){
6        if(nums[i] == 1){
7            count++;
8            max = Math.max(max,count);
9        }
10        else {
11            count = 0;
12        }
13        
14      }  
15      return max;
16    }
17}