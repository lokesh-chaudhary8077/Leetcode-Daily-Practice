// Last updated: 3/18/2026, 6:31:47 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        int row = matrix.length;
5        int col = matrix[0].length;
6        int total = row*col;
7        int minr = 0;
8        int minc = 0;
9        int maxr = row - 1;
10        int maxc = col - 1;
11        int count = 0;
12        while(count < total){
13        for(int i = minc;i <= maxc && count < total;i++){
14            arr.add(matrix[minr][i]);
15            count++;
16        }
17        minr++;
18        for(int i = minr;i <= maxr && count < total;i++){
19            arr.add(matrix[i][maxc]);
20            count++;
21        }
22        maxc--;
23        for(int i = maxc;i >= minc && count < total;i--){
24            arr.add(matrix[maxr][i]);
25            count++;
26        }
27        maxr--;
28        for(int i = maxr;i >= minr && count < total;i--){
29            arr.add(matrix[i][minc]);
30            count++;
31        }
32        minc++;
33        }
34        return arr;
35
36    }
37}