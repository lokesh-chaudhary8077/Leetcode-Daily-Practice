// Last updated: 8/2/2025, 10:39:15 PM
class Solution {
    public int findPeakElement(int[] arr) {
       int n = arr.length;
       if(n == 0) return -1;
       if(n == 1) return 0;
       if(arr[0] > arr[1]) return 0;
       if(arr[n-1] > arr[n-2]) return n-1;
       int start = 1;
       int end = n-2 ;
       while(start <= end){
        int mid = (start + end) / 2;
        if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
            return mid;
        }
        else if(arr[mid] > arr[mid - 1]){
            start = mid + 1;
        }
        else end = mid - 1;
       }
       return -1;
    }
}