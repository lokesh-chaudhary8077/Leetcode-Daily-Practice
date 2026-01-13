// Last updated: 1/13/2026, 9:04:22 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder sb = new StringBuilder();
4       int l1 = word1.length();
5       int l2 = word2.length();
6       int i = 0;
7       int j  = 0;
8       while(i < l1 && j < l2){
9            sb.append(word1.charAt(i++));
10            sb.append(word2.charAt(j++));
11       }
12       while(i < l1){
13            sb.append(word1.charAt(i++));
14       }
15       while(j < l2){
16            sb.append(word2.charAt(j++));
17       }
18       return sb.toString();
19    }
20}