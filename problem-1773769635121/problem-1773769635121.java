// Last updated: 3/17/2026, 11:17:15 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3       int r = matrix.length;
4       int c = matrix[0].length;
5       boolean row[] = new boolean[r];
6       boolean col[] = new boolean[c];
7       for(int i = 0;i < r;i++){
8        for(int j = 0;j < c;j++){
9            if(matrix[i][j] == 0){
10                row[i] = true;
11                col[j] = true;
12            }
13        }
14       }  
15       for(int i = 0;i < r;i++){
16        for(int j = 0;j < c;j++){
17            if(row[i] || col[j]){
18                matrix[i][j] = 0;
19            }
20        }
21       }
22    }
23}