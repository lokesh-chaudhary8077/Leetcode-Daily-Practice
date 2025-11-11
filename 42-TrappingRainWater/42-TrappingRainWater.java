// Last updated: 11/11/2025, 8:43:35 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> result = new ArrayList<>();
      if(matrix == null || matrix.length == 0){
        return result;
      }
      int minr = 0;
      int minc = 0;
      int maxr = matrix.length-1;
      int maxc = matrix[0].length - 1;
      int count = 0;
      int total = matrix[0].length*matrix.length;
      while(count < total){
        for(int i = minc;i <= maxc && count < total;i++){
            result.add(matrix[minr][i]);
            count++;
        }
        minr++;

        for(int i = minr;i <= maxr && count < total;i++){
            result.add(matrix[i][maxc]);
            count++;
        }
        maxc--;
        for(int i = maxc;i>= minc && count < total;i--){
            result.add(matrix[maxr][i]);
            count++;
        }
        maxr--;
        for(int i = maxr;i >= minr &&count < total;i--){
            result.add(matrix[i][minc]);
            count++;
        }
        minc++;
      }
      return result;
      
    }
}