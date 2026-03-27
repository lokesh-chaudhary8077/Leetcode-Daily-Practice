// Last updated: 3/27/2026, 11:09:32 PM
1class Solution {
2    public int minimizedMaximum(int n, int[] nums) {
3        
4       
5        int si = 1;
6        int ei = 0;
7        for (int x : nums) {
8            ei = Math.max(ei, x);
9        }
10         int ans = ei;
11        while(si <= ei){
12            int mid = si + (ei - si)/2;
13            if(isPlace(nums,n,mid)){
14                ans = mid;
15                ei = mid - 1;
16            }
17            else {
18                si = mid + 1;
19            }
20        }
21        return ans;
22
23    }
24    public static boolean isPlace(int nums[],int n,int mid){
25        int sum = 0;
26        for(int i = 0;i < nums.length;i++){
27            sum += (nums[i] + mid - 1) / mid;
28        }
29        return sum <= n;
30    }
31}