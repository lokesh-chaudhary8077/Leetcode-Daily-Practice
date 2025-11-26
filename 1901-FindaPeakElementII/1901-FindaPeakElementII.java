// Last updated: 11/26/2025, 10:35:32 PM
1class Solution {
2    public int[] findPeakGrid(int[][] mat) {
3        int row = mat.length;
4        int column = mat[0].length;
5        int low = 0;
6        int high = mat[0].length - 1;
7        while(low <= high){
8            int mid = (low + high)/2;
9            int maxRow = findMax(mat,row,column,mid);
10            int maxVal = mat[maxRow][mid];
11            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
12            int right = (mid + 1 < column) ? mat[maxRow][mid + 1] : -1;
13           if(maxVal > left && maxVal > right) {
14
15                return new int[]{maxRow,mid};
16            }
17            else if(mat[maxRow][mid] < left){
18                high = mid - 1;
19            }else {
20                low = mid + 1;
21            }
22        }
23        return new int[]{-1,-1};
24    }
25    public static int findMax(int mat[][],int row,int column,int mid){
26        int idx = 0;
27        for(int i = 1;i < row;i++){
28            if(mat[i][mid] > mat[idx][mid]){
29                idx = i;
30            }
31        }
32        return idx;
33    }
34}