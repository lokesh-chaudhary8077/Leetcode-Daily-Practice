// Last updated: 11/14/2025, 1:12:31 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String , List<String>> map = new HashMap<>();
      for(String s : strs){
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(s);
      }  
      return new ArrayList<>(map.values());
    }
}