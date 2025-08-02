// Last updated: 8/2/2025, 10:39:29 PM
class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int l = 0;  //left
        int r = n - 1;  //reight
        while(l < r){
            int w = r - l; //width
            int h = Math.min(arr[l],arr[r]); //height
            int area = w * h;
            ans = Math.max(area,ans);
            if(arr[l] < arr[r]){
                l++;
            }
            else r--;
        }
        return ans;
    }
}