// Last updated: 8/2/2025, 10:39:16 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}