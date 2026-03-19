// Last updated: 3/19/2026, 8:27:09 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int k = nums.length/3;
4        List<Integer> l = new ArrayList<>();
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i = 0;i < nums.length;i++){
7        map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
8        }
9        for(int i : map.keySet()){
10            if(map.get(i) > k){
11                l.add(i);
12            }
13        }
14        return l;
15    }
16}