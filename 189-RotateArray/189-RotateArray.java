// Last updated: 8/2/2025, 10:39:05 PM
class Solution {
    public void rotate(int[] nums, int k) {
        RotateArrays(nums,k);
    }
    public static void RotateArrays(int []arr,int k ) {
		int n = arr.length;
		k = k % n;
		reverse(arr ,0 ,n-1);
		reverse(arr ,0 ,k-1);
		reverse(arr ,k ,n-1);
	}

	public static void reverse(int []arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
}