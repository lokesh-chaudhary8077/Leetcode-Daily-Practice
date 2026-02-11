// Last updated: 2/11/2026, 11:18:16 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int left = 0;
5        int maxLen = 0;
6        for(int i = 0;i < s.length();i++){
7            while(set.contains(s.charAt(i))){
8                set.remove(s.charAt(left++));
9            }
10            set.add(s.charAt(i));
11            maxLen = Math.max(maxLen,i+1-left);
12            
13        }
14        return maxLen;
15        
16    }
17}