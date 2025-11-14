// Last updated: 11/14/2025, 11:59:58 PM
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
       int mat[][] = new int[n][n]; 
        for(int []arr: queries){
            int r1 = arr[0];
            int c1 = arr[1];
            int r2 = arr[2];
            int c2 = arr[3];
            for(int i = r1;i <= r2;i++){
                mat[i][c1] +=1;
                if((c2+1) < n){
                    mat[i][c2+1] -= 1;
                }
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 1;j < n;j++){
                mat[i][j] += mat[i][j-1];
            }
        }
        return mat;

    }
}