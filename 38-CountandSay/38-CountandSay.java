// Last updated: 11/15/2025, 8:20:58 PM
class Solution {
    public String countAndSay(int n) {
       if(n == 1) return "1";
       StringBuilder s = new StringBuilder("");
       String say = countAndSay(n-1);
       for(int i = 0;i < say.length();i++){
            char ch = say.charAt(i);
            int count = 1;
            while(i < say.length()-1 && say.charAt(i) == say.charAt(i+1)){
                count++;
                i++;
            }
            s.append(count).append(ch);
       } 
       return s.toString();
    }
}