// Last updated: 8/14/2025, 10:55:25 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
     int arr[] = {-1,-1};
     int left = binarySearch(nums,target,true);
     int right = binarySearch(nums,target,false);
     arr[0] = left;
     arr[1] = right;
     return arr;  
    }
    public static int binarySearch(int nums[],int target,boolean isBoolean){
        int start = 0;
        int idx = -1;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                idx = mid;
                if(isBoolean){
                    end = mid - 1;
                }
                else start = mid + 1;
            }
        }
        return idx;
    }
}