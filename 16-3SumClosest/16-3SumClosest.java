// Last updated: 8/12/2025, 9:55:02 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int n = nums.length;
       Arrays.sort(nums);
       int closetSum = nums[0] + nums[1] + nums[2];
       for(int i = 0; i < n;i++){
        int j = i + 1;
        int k = n - 1;
        while(j < k){
        int currentSum = nums[i] + nums[j] + nums[k];
        if(currentSum == target) return currentSum;
        if(Math.abs(currentSum - target) < Math.abs(closetSum - target)){
            closetSum = currentSum;
        }
        if(currentSum < target){
            j++;
        }
        else k--;
        }
       } 
       return closetSum;
    }
}