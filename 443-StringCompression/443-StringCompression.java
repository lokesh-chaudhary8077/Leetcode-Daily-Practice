// Last updated: 11/13/2025, 11:29:16 PM
class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        for(int i = 0;i < chars.length;i++){
            int count = 1;
            char ch = chars[i];
            while(i < chars.length - 1 && chars[i] == chars[i + 1]){
                count++;
                i++;
            }
            chars[idx++] = ch;
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                   chars[idx++] = c; 
                }
            }
        }
        return idx;
    }
}