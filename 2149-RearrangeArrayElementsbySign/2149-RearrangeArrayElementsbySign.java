// Last updated: 3/16/2026, 2:38:52 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int arr[] = new int[nums.length];
4        
5        int pi = 0;
6        int ni = 1;
7        for(int i = 0;i< nums.length;i++){
8            if(nums[i] > 0){
9                arr[pi] = nums[i];
10                pi +=2;
11            }
12            else{
13                arr[ni] = nums[i];
14                ni += 2;
15            }
16        }
17        
18        return arr;
19    }
20}