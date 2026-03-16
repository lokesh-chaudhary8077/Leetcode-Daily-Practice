// Last updated: 3/16/2026, 1:57:43 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int p = nums[0];
5        for(int i = 1;i < nums.length;i++){
6            if(p == nums[i]){
7                count++;
8            }
9            else if(count == 0){
10                p = nums[i];
11            }else{
12                count--;
13            }
14        }
15        return p;
16    }
17}