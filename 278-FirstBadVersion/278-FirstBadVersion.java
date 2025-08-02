// Last updated: 8/2/2025, 10:39:13 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int l = 0;
    int h = n;
    int ans = 0;
    while(l <= h){
        int mid = (l + (h - l)/2);
        if(isBadVersion(mid) == true){
            ans = mid;
            h = mid - 1;
        }
        else l = mid + 1;
    } 
    return ans;
    }
}