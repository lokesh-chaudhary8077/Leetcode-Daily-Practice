// Last updated: 8/11/2025, 9:46:51 PM
class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return start;
    }
}