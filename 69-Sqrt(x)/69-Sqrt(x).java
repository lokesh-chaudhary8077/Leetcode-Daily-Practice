// Last updated: 1/19/2026, 11:57:16 PM
1class Solution {
2    public int mySqrt(int x) {
3        long si = 1;
4        long ei = x;
5        long ans = 0;
6        while (si <= ei) {
7            long mid = (ei+si)/2;
8            if (mid * mid == x) {
9                return (int)mid;
10
11            }else if(mid * mid <= x){
12                ans = mid;
13                si = mid + 1;
14            }
15            else {
16                ei = mid - 1;
17            }
18        }
19        return (int) ans;
20    }
21}