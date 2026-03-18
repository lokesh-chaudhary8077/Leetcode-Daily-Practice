// Last updated: 3/18/2026, 8:26:15 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int sum = 0;
5        int ans = 0;
6        map.put(0,1);
7        for(int i = 0;i < nums.length;i++){
8            sum = sum + nums[i];
9            if(map.containsKey(sum-k)){
10                ans += map.get(sum-k);
11            }
12            map.put(sum,map.getOrDefault(sum,0) + 1);
13        }
14        return ans;
15        
16    }
17}