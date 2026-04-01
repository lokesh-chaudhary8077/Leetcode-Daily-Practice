// Last updated: 4/1/2026, 11:51:51 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i = 0;i < s.length();i++){
5            char ch = s.charAt(i);
6            map.put(ch,map.getOrDefault(ch,0) + 1);
7        }
8        for(int i = 0;i < t.length();i++){
9            char ch = t.charAt(i);
10            if(!map.containsKey(ch)) return false;
11            map.put(ch,map.get(ch) -1);
12            if(map.get(ch) == 0) map.remove(ch);
13
14        }
15        return map.isEmpty();
16    }
17}