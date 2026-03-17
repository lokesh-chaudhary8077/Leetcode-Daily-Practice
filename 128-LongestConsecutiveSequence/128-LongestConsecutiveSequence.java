// Last updated: 3/17/2026, 10:06:00 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Arrays.sort(nums);
4        int count  = 1;
5        int maxLen = 1;
6        if(nums.length == 1) return 1;
7        if(nums.length == 0) return 0;
8        
9       for(int i = 1;i < nums.length;i++){
10        if(nums[i] == nums[i - 1]){
11            continue;
12        }
13        else if(nums[i] == nums[i-1] + 1){
14            count++;
15            maxLen = Math.max(maxLen,count);
16        }
17        else {
18            count = 1;
19        }
20       } 
21       return maxLen;
22    }
23}