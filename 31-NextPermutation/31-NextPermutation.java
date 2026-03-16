// Last updated: 3/16/2026, 10:26:45 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3    int n = nums.length;    
4    int pivot = -1;
5    for(int i = n-2;i >= 0;i--){
6        if(nums[i] < nums[i+1]){
7            pivot = i;
8            break;
9        }
10    }
11    if(pivot != -1){
12    for(int i = n-1;i >= 0;i--){
13        if(nums[i] > nums[pivot]){
14            int temp = nums[i];
15            nums[i] = nums[pivot];
16            nums[pivot] = temp;
17            break;
18        }
19    } 
20    }
21    int si = pivot+1;
22    int ei = n-1;
23    while(si < ei){
24        int temp = nums[si];
25        nums[si] = nums[ei];
26        nums[ei] = temp;
27        si++;
28        ei--;
29    }
30    }
31}