// Last updated: 1/13/2026, 10:09:58 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr = s.toCharArray();
4        int i = 0;
5        int j = arr.length - 1;
6        while(i < j){
7            if(isVowel(arr[i]) && isVowel(arr[j])){
8                char ch = arr[i];
9                arr[i] = arr[j];
10                arr[j] = ch;
11                i++;
12                j--;
13            }
14            else if(isVowel(arr[i]) && !isVowel(arr[j])){
15                j--;
16            }
17            else{
18                i++;
19            }
20        }
21        return new String(arr); 
22    }
23    private boolean isVowel(char c){
24        c = Character.toLowerCase(c);
25        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
26    }
27}