// Last updated: 3/26/2026, 10:54:12 PM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12       int si = 1;
13       int ei = n;
14       while(si <= ei){
15         int mid = si + (ei - si) / 2;
16         int res = guess(mid);
17         if(res == 0) return mid;
18         else if(res == -1) ei = mid - 1;
19         else si = mid + 1;
20       } 
21       return -1;
22    }
23}