// Last updated: 3/27/2026, 9:03:50 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4        if(n == 1) return nums[0];
5        if(nums[0] != nums[1]) return nums[0];
6        if(nums[n-1] != nums[n-2]) return nums[n-1];
7        int si = 1;
8        int ei = n-2;
9        while(si < ei){
10            int mid = si + (ei - si) / 2;
11            if(mid % 2 != 0) mid--;
12            if(nums[mid] == nums[mid+1]) si = mid + 2;
13            else ei = mid;
14        }
15        return nums[si];
16    }
17}