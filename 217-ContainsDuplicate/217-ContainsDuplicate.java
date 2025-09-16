// Last updated: 9/16/2025, 10:57:19 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for (int i = 0; i< nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        else set.add(nums[i]);
       } return false;
    }
}