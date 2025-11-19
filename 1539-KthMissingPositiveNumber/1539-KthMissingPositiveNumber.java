// Last updated: 11/19/2025, 9:28:50 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
      int si = 0;
      int ei = arr.length - 1;
      while(si <= ei){
        int mid = (si + ei)/2;
        int miss = arr[mid] - (mid + 1);
        if(miss < k){
            si = mid + 1;
        }else ei = mid - 1;
      }  
      return k + ei + 1;
    }
}