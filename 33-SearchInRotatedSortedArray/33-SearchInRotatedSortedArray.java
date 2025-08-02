// Last updated: 8/2/2025, 10:39:25 PM
class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == target){
                return mid;
            }
            //left part is sort
            if (arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                }
                else start = mid + 1;
            }
            else {
                if (arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}