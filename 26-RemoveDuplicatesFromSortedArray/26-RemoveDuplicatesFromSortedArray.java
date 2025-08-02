// Last updated: 8/2/2025, 10:39:26 PM
class Solution {
    public int removeDuplicates(int[] nums) {
       int count = 0;
        for (int i = 0;i < nums.length;i++){
            if (i == 0 || nums[i] != nums[i-1]){
                 nums[count] = nums[i];
                 count++;
            }
        }
        return count;
    }
}