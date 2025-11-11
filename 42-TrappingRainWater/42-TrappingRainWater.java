// Last updated: 11/11/2025, 9:31:22 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if(target == matrix[row][column]){
                return true;
            }
            else if(target < matrix[row][column]){
                column--;
            }
            else row++;
        }
        return false;
    }
}