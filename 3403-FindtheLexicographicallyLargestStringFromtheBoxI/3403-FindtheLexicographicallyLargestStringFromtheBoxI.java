// Last updated: 11/16/2025, 9:58:33 PM
class Solution {
    public String answerString(String word, int numFriends) {
         if (numFriends == 1) return word;
        int n = word.length();
        int lengthPossible = n - (numFriends - 1);
        String result = "";
        for(int i = 0;i < n;i++){
            String temp;
            if(i + lengthPossible <= n){
                temp = word.substring(i,i+lengthPossible);
            }else{
                temp = word.substring(i);
            }
            if(temp.compareTo(result) > 0){
                result = temp;
            }
        }
        return result;
    }
}