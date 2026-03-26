// Last updated: 3/26/2026, 11:24:56 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int si = 0;
4        int ei = arr.length -1;
5        while(si < ei){
6            int mid = si + (ei - si) /2;
7            if(arr[mid] < arr[mid + 1]){
8                si = mid + 1;
9            }
10            else {
11                ei = mid;
12            }
13        }
14        return si;
15    }
16}