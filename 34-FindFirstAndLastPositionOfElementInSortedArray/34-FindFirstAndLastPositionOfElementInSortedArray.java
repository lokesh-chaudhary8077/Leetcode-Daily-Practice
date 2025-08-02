// Last updated: 8/2/2025, 10:39:24 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = start(nums, target); // first occurrence
        ans[1] = end(nums, target);   // last occurrence
        return ans;
    }
    public static int start(int [] arr,int t ) {
		int start = 0;
		int idx = -1;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/ 2;
			if (arr[mid] >= t) {
				end = mid - 1;
			}
			else start = mid + 1;
			if(arr[mid] == t)
				idx = mid;
		}
		return idx;
	}
	public static int end(int [] arr,int t ) {
		int start = 0;
		int idx = -1;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/ 2;
			if (arr[mid] <= t) {
				start = mid + 1;
			}
			else end = mid - 1;
			if(arr[mid] == t)
				idx = mid;
		}
		return idx;
	}
}