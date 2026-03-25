// Last updated: 3/25/2026, 10:49:53 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total = 0;
4        int sum = 0;
5        for(int i = 0;i < nums.length;i++){
6            total += nums[i];
7        }
8        
9        for(int i = 0;i < nums.length;i++){
10            
11            
12
13            if(total - sum - nums[i] == sum) return i;
14            sum += nums[i];
15 
16        }
17        return -1;
18    }
19}