// Last updated: 3/26/2026, 8:54:53 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int si = 0;
4        int ei = nums.length-1;
5        int ans = -1;
6        while(si <= ei){
7            int mid = (si + ei) / 2;
8            if(nums[mid] == target){
9                return mid;
10            }
11            else if(nums[mid] < target){
12                si = mid + 1;
13            }
14            else {
15                ei = mid - 1;
16            }
17        }
18        return -1;
19    }
20}