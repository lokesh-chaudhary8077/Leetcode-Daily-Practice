// Last updated: 3/25/2026, 11:42:40 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        
4        int even = 0;
5        for(int i = 0;i < nums.length;i++){
6            int count = 0;
7            int n = nums[i];
8            while(n  >0){
9                n = n / 10;
10                count++;
11            }
12            if(count % 2 == 0){
13                even++;
14            }
15        }
16        return even;
17    }
18}