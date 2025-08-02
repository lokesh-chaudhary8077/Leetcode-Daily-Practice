// Last updated: 8/2/2025, 10:39:10 PM
class Solution {
    public int majorityElement(int[] arr) {
       int cand = 0;
       int count = 0;
       for(int i=0;i < arr.length;i++){
            if (count == 0){
                cand = arr[i];
            }
            if(cand == arr[i]){
                count++;
            }
            else count--;
       } 
       return cand;
    }
}