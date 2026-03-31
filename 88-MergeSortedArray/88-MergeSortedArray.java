// Last updated: 3/31/2026, 2:00:57 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int []arr = new int[n];
5        for(int i = 0;i < n;i++){
6            arr[i] = nums[i] * nums[i];
7        }
8        mergeSort(arr,0,n-1);
9        return arr;
10    }
11    void mergeSort(int []arr,int si,int ei){
12        if(si >= ei) return ;
13        int mid = si + (ei-si)/2;
14        mergeSort(arr,si,mid);
15        mergeSort(arr,mid+1,ei);
16        merge(arr,si,mid,ei);
17    }
18    void merge(int []arr,int si ,int mid,int ei){
19        int i = si;
20        int j = mid + 1;
21        int k = 0;
22        int temp[] = new int[ei - si + 1];
23        while(i <= mid && j <= ei){
24            if(arr[i] < arr[j]){
25                temp[k] = arr[i];
26                k++;
27                i++;
28            }else{
29                temp[k] = arr[j];
30                k++;
31                j++;
32            }
33        }
34        while(i <= mid){
35            temp[k++] = arr[i++];
36        }
37        while(j <= ei){
38            temp[k++] = arr[j++];
39        }
40        for(int p = 0;p<temp.length;p++){
41            arr[p+si] = temp[p];
42        }
43        
44    }
45}