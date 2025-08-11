// Last updated: 8/11/2025, 11:20:32 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int i = 0;i < nums.length;i++){
        if(hm.containsKey(nums[i])){
            int pastIdx = hm.get(nums[i]);
            if(Math.abs(pastIdx - i) <= k){
                return true;
            }
            else hm.put(nums[i],i);
        }
        else hm.put(nums[i],i);
      }  
      return false;
    }
}