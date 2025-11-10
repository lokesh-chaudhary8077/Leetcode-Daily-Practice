// Last updated: 11/10/2025, 4:49:12 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int repeat = -1;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < n;i++){
            for(int j = 0;j <n;j++){
                if(set.contains(grid[i][j])){
                    repeat = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                    sum += grid[i][j];
                }
            }
        }
        int actualSum = size*(size + 1)/2;
        int missing = actualSum - sum;
        return new int[]{repeat,missing};
    }
}