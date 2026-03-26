// Last updated: 3/26/2026, 9:32:17 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int si = 1;
7        int ei = n;
8        int ans = 0;
9        while(si <= ei){
10             int mid = si + (ei - si) / 2;
11            if(isBadVersion(mid)){
12                ei = mid - 1;
13                ans = mid;
14            }
15            else {
16                si = mid + 1;
17            }
18        }
19        return ans;
20        
21    }
22}