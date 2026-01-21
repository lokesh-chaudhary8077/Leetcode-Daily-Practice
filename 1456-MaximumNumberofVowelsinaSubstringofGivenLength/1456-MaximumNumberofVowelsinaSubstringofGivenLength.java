// Last updated: 1/21/2026, 11:40:16 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3       int ans = 0;
4       int count = 0;
5       for(int i = 0;i < k;i++){
6            if(isVowel(s.charAt(i))){
7                count++;
8            }
9       } 
10       ans = count;
11       for(int i = k;i < s.length();i++){
12            if(isVowel(s.charAt(i))){
13                count++;
14            }
15            if(isVowel(s.charAt(i-k))){
16                count--;
17            }
18            ans = Math.max(ans,count);
19       }
20       return ans;
21    }
22    public boolean isVowel(char ch){
23        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
24    }
25}