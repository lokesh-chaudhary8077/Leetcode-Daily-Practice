// Last updated: 3/9/2026, 11:44:22 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int si = 0;
4        int mid  = 0;
5        int ei = nums.length - 1;
6        while(mid <= ei){
7            if(nums[mid] == 0){
8                int temp = nums[mid];
9                nums[mid] = nums[si];
10                nums[si] = temp;
11                mid++;
12                si++;
13            }
14            else if(nums[mid] == 1){
15                mid++;
16            }
17            else{
18                int temp = nums[mid];
19                nums[mid] = nums[ei];
20                nums[ei] = temp;
21                ei--; 
22            }
23        }
24    }
25}