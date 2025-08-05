// Last updated: 8/5/2025, 10:49:14 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int item) {
       int r = 0;
       int c =  arr[0].length - 1;
       while(r < arr.length && c >= 0 ){
        if(arr[r][c] == item){
            return true;
        }
        else if (arr[r][c] > item){
            c--;
        }
        else r++;
       }
       return false;
    }
}