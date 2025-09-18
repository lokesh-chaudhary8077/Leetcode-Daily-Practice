// Last updated: 9/18/2025, 10:50:23 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int maxval = n*n;
        int count[] = new int[maxval+1];
        int repeat = -1;
        int missing =  -1;
        for(int i[] : grid){
            for(int j : i){
                count[j]++;
            }
        }
        for(int i = 1;i <= maxval;i++){
            if(count[i] == 2){
                repeat = i;
            }
            if(count[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeat, missing};
    }
}