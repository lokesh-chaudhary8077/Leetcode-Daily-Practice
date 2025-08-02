// Last updated: 8/2/2025, 10:39:22 PM
class Solution {
    public int trap(int[] arr) {
		int n =  arr.length;
       int sum = 0;
       int left[] = new int[n];
       int right[] = new int[n];
       left[0] = arr[0];
       for (int i = 1;i < arr.length;i++){
        left[i] = Math.max(left[i-1],arr[i]);
       }
        
        right[n-1] = arr[n-1];
        for(int i = n-2;i >= 0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        for (int i = 0;i < arr.length;i++){
            sum += (Math.min(left[i],right[i]) - arr[i]);
        }
        return sum;
	}
}