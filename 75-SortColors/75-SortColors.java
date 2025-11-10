// Last updated: 11/10/2025, 9:45:13 PM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
       int left = 0;
       int right = n -1; 
       int iteration = 0;
       while( iteration <= right){
        if(nums[iteration] == 0){
            int temp = nums[iteration];
            nums[iteration] = nums[left];
            nums[left] = temp;
            iteration++;
            left++;
        }else if(nums[iteration] == 2){
            int temp = nums[iteration];
            nums[iteration] = nums[right];
            nums[right] = temp;
            right--;
        }
        else{
            iteration++;
        }
       }
    }
}