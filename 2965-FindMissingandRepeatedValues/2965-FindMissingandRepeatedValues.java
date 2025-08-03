// Last updated: 8/3/2025, 9:35:08 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int n = arr.length;
        int s = n*n;
        int nums[] = new int[s + 1];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                nums[arr[i][j]]++;
            }
        }
        int a = -1,b = -1;
        for (int i = 1; i <= s;i++){
            if (nums[i] == 2){
                a = i;
            }
            else if (nums[i] == 0){
                b = i;
            }
        }
        return new int[]{a,b};
    }
    
}