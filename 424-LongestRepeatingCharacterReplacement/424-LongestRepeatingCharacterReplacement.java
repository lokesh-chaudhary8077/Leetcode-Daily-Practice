// Last updated: 1/22/2026, 10:09:10 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3      int left = 0;
4      int [] fre = new int[26];
5      int maxFre = 0;
6      int ans = 0;
7      for(int i = 0;i < s.length();i++){
8        fre[s.charAt(i) - 'A']++;
9        maxFre = Math.max(maxFre,fre[s.charAt(i) - 'A']);
10        while((i - left + 1)- maxFre > k){
11            fre[s.charAt(left) - 'A']--;
12            left++;
13        }
14        ans = Math.max(ans,i - left + 1);
15      }
16      return ans;  
17    }
18}