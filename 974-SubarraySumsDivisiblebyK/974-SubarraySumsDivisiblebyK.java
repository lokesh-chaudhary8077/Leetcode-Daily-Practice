// Last updated: 1/28/2026, 11:10:31 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5        int sum = 0;
6        int count = 0;
7        for(int i = 0;i < nums.length;i++){
8            sum += nums[i];
9            int rem = sum % k;
10            if(rem < 0) rem += k;
11            if(map.containsKey(rem)){
12                count += map.get(rem);
13            }
14            map.put(rem,map.getOrDefault(rem,0) + 1);
15        }
16        return count;
17    }
18}