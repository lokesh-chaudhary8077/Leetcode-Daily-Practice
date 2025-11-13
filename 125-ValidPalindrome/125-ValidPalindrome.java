// Last updated: 11/13/2025, 10:39:14 PM
class Solution {
    public String capitalizeTitle(String title) {
       String words[] = title.toLowerCase().split(" ");
       StringBuilder sb = new  StringBuilder("");
       for(int i = 0;i < words.length;i++){
        String w = words[i];
        if(w.length() > 2){
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
        }
        else sb.append(w);
        if(i < words.length - 1) sb.append(' ');
       }
       return sb.toString();
    }
}