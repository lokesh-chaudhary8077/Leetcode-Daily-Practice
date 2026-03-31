// Last updated: 3/31/2026, 11:29:47 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int si = 0;
4        int ei = nums.length-1;
5        int k = 0;
6        while(k <= ei){
7            if(nums[k] == 0){
8                int temp = nums[k];
9                nums[k] = nums[si];
10                nums[si] = temp;
11                k++;
12                si++;
13            }
14            else if(nums[k] == 1){
15                k++;
16            }
17            else{
18                int temp = nums[k];
19                nums[k] = nums[ei];
20                nums[ei] = temp;
21                ei--;
22            }
23        }
24    }
25}