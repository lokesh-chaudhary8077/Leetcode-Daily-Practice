// Last updated: 3/26/2026, 9:21:32 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int si = 0;
4        int ei = nums.length - 1;
5        while(si <= ei){
6            int mid = (si + ei) /2;
7            if(nums[mid] == target){
8
9                return mid;
10            }
11            else if(nums[mid] < target){
12                si = mid + 1;
13            }
14            else {
15                ei = mid - 1;
16            }
17        
18        }
19        return si;
20    }
21}