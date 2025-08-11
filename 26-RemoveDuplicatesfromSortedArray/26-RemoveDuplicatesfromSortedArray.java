// Last updated: 8/11/2025, 8:36:04 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0;i < nums.length;i++){
           if(i < nums.length - 1 && nums[i] == nums[i + 1]){
            continue;
           }
           else {
            nums[count] = nums[i];
            count++;
           }
        }
        return count;
    }
}