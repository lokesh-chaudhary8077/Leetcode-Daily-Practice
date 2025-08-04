// Last updated: 8/4/2025, 11:53:23 PM
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n = nums.length;
       for(int i : nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        } else {
            map.put(i , 1);
        }
        if(map.get(i) > n / 2){
            return i;
        }
       }
       return -1; 
    }
}