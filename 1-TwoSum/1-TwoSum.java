// Last updated: 3/25/2026, 9:28:09 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int i = 0;i < nums.length;i++){
5            if(map.containsKey(target-nums[i])){
6                return new int[]{map.get(target - nums[i]),i};
7            }
8            if(!map.containsKey(target-nums[i])){
9                map.put(nums[i],i);
10            }
11
12        }
13        return new int[]{};
14    }
15}