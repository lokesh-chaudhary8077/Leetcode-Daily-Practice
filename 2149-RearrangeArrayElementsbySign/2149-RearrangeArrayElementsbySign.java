// Last updated: 3/16/2026, 2:33:37 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int p[] = new int[nums.length/2];
4        int n[] = new int[nums.length/2]; 
5        int pidx = 0;
6        int nidx = 0;
7        for(int i = 0;i< nums.length;i++){
8            if(nums[i] > 0){
9                p[pidx++] = nums[i];
10            }
11            else{
12                n[nidx++] = nums[i];
13            }
14        }
15        int pi = 0;
16        int ni = 0;
17        for(int i = 0;i < nums.length;i=i+2){
18            nums[i] = p[pi++];
19            nums[i+1] = n[ni++];
20
21        }
22        return nums;
23    }
24}