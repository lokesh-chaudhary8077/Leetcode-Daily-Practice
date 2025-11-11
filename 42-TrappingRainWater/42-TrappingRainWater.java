// Last updated: 11/11/2025, 10:22:24 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
       int left = leftsearch(nums,target);
       int right = rightsearch(nums,target);
       arr[0] = left;
       arr[1] = right;
       return arr; 
    }
    public static int leftsearch(int nums[],int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) /2;
            if(nums[mid] == target){
                idx = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return idx;
    }
     public static int rightsearch(int nums[],int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) /2;
            if(nums[mid] == target){
                idx = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return idx;
    }
}