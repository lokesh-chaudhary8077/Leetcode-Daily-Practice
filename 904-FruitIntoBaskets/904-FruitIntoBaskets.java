// Last updated: 1/21/2026, 11:19:59 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3       int left = 0;
4       int maxlen = 0;
5       HashMap<Integer,Integer> map = new HashMap<>();
6       for(int right = 0;right < fruits.length;right++){
7            map.put(fruits[right],map.getOrDefault(fruits[right],0));
8            map.put(fruits[right],map.get(fruits[right])+1);
9            while(map.size()>2){
10                map.put(fruits[left],map.get(fruits[left])-1);
11                if(map.get(fruits[left]) == 0){
12                    map.remove(fruits[left]);
13                }
14                left++;
15            }
16            maxlen = Math.max(maxlen,right-left+1);
17
18       } 
19       return maxlen;
20    }
21}