// Last updated: 3/16/2026, 1:50:33 PM
1class Solution {
2    public void sortColors(int[] nums) {
3      int si = 0;
4      int ei = nums.length - 1;
5      int mid = 0;
6      while(mid <= ei){
7        if(nums[mid] == 0){
8            int temp = nums[si];
9            nums[si] = nums[mid];
10            nums[mid] = temp;
11            si++;
12            mid++;
13        }
14        else if(nums[mid] == 1){
15            mid++;
16        }
17        else{
18            int temp = nums[mid];
19            nums[mid] = nums[ei];
20            nums[ei] = temp;
21            ei--;
22        }
23      }
24    }
25}