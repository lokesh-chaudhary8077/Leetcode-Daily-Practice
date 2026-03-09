// Last updated: 3/9/2026, 9:28:03 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3       HashMap<Integer,Integer> map = new HashMap<>();
4       int ans = 0;
5       int sum = 0;
6       map.put(0,1);
7        
8       for(int i = 0;i < nums.length;i++){
9        sum = sum + nums[i];
10        if(map.containsKey(sum - k)){
11            ans += map.get(sum-k);
12        }
13        map.put(sum,map.getOrDefault(sum,0) + 1);
14        
15       }
16       return ans;
17
18    }
19}