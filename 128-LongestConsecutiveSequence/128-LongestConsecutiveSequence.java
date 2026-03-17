// Last updated: 3/17/2026, 10:03:49 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3      if(nums.length == 0) return 0;
4      Arrays.sort(nums);
5      int count = 1;
6      int max = 1;
7      for(int i= 1 ;i < nums.length;i++){
8        if(nums[i] == nums[i- 1]){
9            continue;
10        }else if(nums[i] == nums[i-1]+1){
11            count++;
12        }else{
13            count = 1;
14        }
15        max = Math.max(max,count);
16      }
17      return max;
18
19    }
20}