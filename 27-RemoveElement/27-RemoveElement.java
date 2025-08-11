// Last updated: 8/11/2025, 8:42:22 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}