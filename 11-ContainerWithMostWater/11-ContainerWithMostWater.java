// Last updated: 8/12/2025, 8:28:25 PM
class Solution {
    public int maxArea(int[] nums) {
     int n = nums.length;
     int left = 0;
     int right = n - 1; 
     int ans = 0;
    while(left < right){
        int width = right - left;
        int height = Math.min(nums[left],nums[right]);
        int area = width * height;
        ans = Math.max(ans,area);
        if(nums[left] < nums[right]){
            left++;
        }
        else right--;
    }
    return ans;
    }
}