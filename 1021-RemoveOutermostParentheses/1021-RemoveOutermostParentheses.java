// Last updated: 2/10/2026, 8:43:13 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder res = new StringBuilder();
4        int count = 0;
5        for(char ch : s.toCharArray()){
6            if(ch == '('){
7                if(count > 0) res.append(ch);
8                count++;
9            }
10            else{
11                count--;
12                if(count > 0) res.append(ch);
13            }
14        }
15        return res.toString();
16    }
17}