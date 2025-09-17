// Last updated: 9/17/2025, 10:15:51 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i = n - 2;i >= 0;i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i = n -1;i> 0;i--){
            if(nums[i] > nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
    public void reverse(int nums[],int i,int j){
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int nums[],int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}