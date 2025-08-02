// Last updated: 8/2/2025, 10:39:21 PM
class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = 0;j < arr.length;j++){
                sum += arr[j];
                ans = Math.max(sum,ans);
                if (sum < 0){
                    sum = 0;
                }
            }
        return ans;

    }
}