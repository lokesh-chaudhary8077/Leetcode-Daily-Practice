// Last updated: 11/12/2025, 11:31:19 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        int si = 1;
        int ei = n - 2;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }
           else if(nums[mid-1] < nums[mid]){
             si = mid + 1;
           }
           else ei = mid - 1;
        }
        return -1;
    }
}