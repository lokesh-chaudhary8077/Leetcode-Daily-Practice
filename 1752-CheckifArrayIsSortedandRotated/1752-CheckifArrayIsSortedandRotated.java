// Last updated: 1/23/2026, 10:57:27 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4        int n = nums.length;
5        for (int i = 0; i < n - 1; i++) {
6            if (nums[i] > nums[i + 1]) {
7                count++;
8            }
9        }
10        if (nums[n - 1] > nums[0]) {
11            count++;
12        }
13
14        return count <= 1;
15    }
16}