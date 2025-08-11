// Last updated: 8/11/2025, 11:32:31 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       int actualSum =  n*(n+1)/2;
       int sum = 0;
       for(int i = 0;i < n ;i++){
        sum += nums[i];
       }
       int missingNo = actualSum - sum;
       return missingNo;
    }
}