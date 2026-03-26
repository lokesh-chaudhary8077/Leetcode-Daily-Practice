// Last updated: 3/26/2026, 11:55:41 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4        if(n == 1) return nums[0];
5        if(nums[0] != nums[1]) return nums[0];
6        if(nums[n-1] != nums[n-2]) return nums[n-1];
7        int si = 1;
8        int ei = n-2;
9        while(si < ei){
10            int mid = (si + ei) /2;
11            if(mid % 2 == 1) mid--;
12            if(nums[mid] == nums[mid + 1]){
13                si = mid + 2;
14            }
15            else {
16                ei = mid;
17            }
18        }
19        return nums[si];
20
21    }
22}