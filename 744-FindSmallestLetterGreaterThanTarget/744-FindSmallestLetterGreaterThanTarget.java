// Last updated: 1/31/2026, 9:15:22 PM
1class Solution {
2    public char nextGreatestLetter(char[] nums, char target) {
3        int n = nums.length;
4        char ch = nums[0];
5        int si = 0;
6        int ei = n-1;
7        while(si <= ei){
8            int mid = (si + ei)/2;
9            if(nums[mid] - target > 0){
10                ei = mid - 1;
11                ch = nums[mid];
12            }
13            else {
14                si = mid + 1;
15            }
16        }
17        return ch;
18    }
19}