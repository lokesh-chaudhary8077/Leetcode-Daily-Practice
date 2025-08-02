// Last updated: 8/2/2025, 10:39:12 PM
class Solution {
    public int search(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;  

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1; 
    }
}
