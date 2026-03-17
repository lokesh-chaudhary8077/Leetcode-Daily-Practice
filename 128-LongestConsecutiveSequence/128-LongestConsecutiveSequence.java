// Last updated: 3/17/2026, 9:50:27 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3      HashSet<Integer> set = new HashSet<>();
4      for(int i = 0;i  < nums.length;i++){
5        set.add(nums[i]);
6      } 
7      int maxLen = 0;
8      for(int num : set){
9        if(!set.contains(num-1)){
10            int curr = num;
11            int count = 1;
12            while(set.contains(curr + 1)){
13                count++;
14                curr++;
15            }
16            maxLen = Math.max(maxLen,count);
17        }
18      } 
19      return maxLen;
20    }
21}