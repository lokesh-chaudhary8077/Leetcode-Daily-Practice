// Last updated: 3/9/2026, 11:23:58 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int sum = 0;
5        for(int i = 0;i < nums.length;i++){
6            if(map.containsKey(target-nums[i]) ){
7                return new int[]{map.get(target - nums[i]),i};
8            }
9            if(!map.containsKey(target - nums[i])){
10                map.put(nums[i],i);
11            }
12        }
13        return new int[]{};
14    }
15}