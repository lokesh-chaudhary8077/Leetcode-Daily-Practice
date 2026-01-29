// Last updated: 1/29/2026, 9:08:11 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3      int count = 0;
4      int candidate = 0;
5      for(int i = 0;i < nums.length;i++){
6        if(count == 0){
7            candidate = nums[i];
8        } 
9        if(nums[i] == candidate){
10            count++;
11        }else {
12            count--;
13        }
14      }
15      return candidate;  
16    }
17}