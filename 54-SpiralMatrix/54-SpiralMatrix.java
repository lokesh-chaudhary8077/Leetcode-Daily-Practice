// Last updated: 8/20/2025, 10:40:48 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return ans;
        }
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;
        int count = 0;
        int total = matrix[0].length * matrix.length;
        while(count < total){
            for (int i = minc;i <= maxc && count < total;i++){
                ans.add(matrix[minr][i]);
                count++;
            }
            minr++;
            for (int i = minr;i <= maxr && count < total;i++){
                ans.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
            for (int i = maxc;i >= minc && count < total;i--){
                ans.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
            for (int i = maxr;i >= minr && count <total;i--){
                ans.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ans;
    }
}