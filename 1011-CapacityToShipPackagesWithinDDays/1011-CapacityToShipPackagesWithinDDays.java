// Last updated: 11/12/2025, 9:05:47 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int si = 0;
        int ei = 0;
        for(int i = 0;i < weights.length;i++){
            si = Math.max(si,weights[i]);
            ei += weights[i]; 
        }
        int ans = 0;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(isItPossible(weights,days,mid)){
                ans = mid;
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int weights[],int days,int mid){
        int dayCount = 1;
        int sum = 0;
        for(int i = 0;i < weights.length;i++){
            if(sum + weights[i] > mid){
                dayCount++;
                sum = 0;
            }
            sum += weights[i];
        }
        return dayCount <= days;
    }
}