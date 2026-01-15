// Last updated: 1/15/2026, 8:58:19 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        long v1 = Long.MIN_VALUE; 
4        long v2 = Long.MIN_VALUE;
5        long v3 = Long.MIN_VALUE;
6        for(int i = 0;i < nums.length;i++){
7            if(nums[i] == v1 || nums[i] == v2 || nums[i] == v3){
8                continue;
9            }
10            if(nums[i] > v1){
11                v3 = v2;
12                v2 = v1;
13                v1 = nums[i];
14            }
15            else if(nums[i] > v2){
16                v3 = v2;
17                v2 = nums[i];
18            }
19            else if(nums[i] > v3) {
20                v3 = nums[i];
21            }
22        }
23        if(v3 == Long.MIN_VALUE) return (int)v1;
24        else return (int)v3;
25    }
26}