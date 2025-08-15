// Last updated: 8/15/2025, 8:13:31 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = {-1,-1};
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}