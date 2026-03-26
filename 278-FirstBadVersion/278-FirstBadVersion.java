// Last updated: 3/26/2026, 10:41:58 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int si = 0;
4        int ei = nums.length - 1;
5        while(si < ei){
6             int mid = si + (ei - si) / 2;
7            if(nums[mid] > nums[ei]){
8                si = mid + 1;
9            }else{
10                ei = mid;
11            }
12            
13        }
14        return nums[si];
15
16
17    }
18}