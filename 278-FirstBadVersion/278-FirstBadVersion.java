// Last updated: 3/26/2026, 9:59:38 PM
1class Solution {
2    public int search(int[] nums, int target) {
3       int si = 0;
4       int ei = nums.length - 1;
5       while(si <= ei){
6          int mid = si + (ei - si) / 2;
7          if(nums[mid] == target) return mid;
8          if(nums[si] <= nums[mid]){
9            if(nums[si] <= target && nums[mid] > target){
10                ei = mid - 1;
11            }
12            else{
13                si = mid + 1;
14            }
15          }
16          else{
17            if(nums[ei] >= target && nums[mid] < target){
18                si = mid + 1;
19            }
20            else {
21                ei = mid - 1;
22            }
23          }
24       } 
25       return -1;
26    }
27}