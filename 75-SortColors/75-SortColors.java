// Last updated: 11/10/2025, 9:50:49 PM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
       int left = 0;
       int right = n -1; 
       int iteration = 0;
       while( iteration <= right){
        if(nums[iteration] == 0){
            swap(nums,iteration,left);
            iteration++;
            left++;
        }else if(nums[iteration] == 2){
            swap(nums,iteration,right);
            right--;
        }
        else{
            iteration++;
        }
       }
    }
    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    
    }
}