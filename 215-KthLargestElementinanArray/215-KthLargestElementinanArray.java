// Last updated: 3/31/2026, 7:58:45 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        int n = nums.length;
4        mergeSort(nums,0,n-1);
5        return nums[n-k];
6    }
7    void mergeSort(int []nums,int si,int ei){
8        if(si >= ei) return ;
9        int mid = si + (ei-si)/2;
10        mergeSort(nums,si,mid);
11        mergeSort(nums,mid+1,ei);
12        merge(nums,si,mid,ei);
13    }
14    void merge(int []nums,int si ,int mid,int ei){
15        int i = si;
16        int j = mid + 1;
17        int k = 0;
18        int temp[] = new int[ei - si + 1];
19        while(i <= mid && j <= ei){
20            if(nums[i] < nums[j]){
21                temp[k] = nums[i];
22                k++;
23                i++;
24            }else{
25                temp[k] = nums[j];
26                k++;
27                j++;
28            }
29        }
30        while(i <= mid){
31            temp[k++] = nums[i++];
32        }
33        while(j <= ei){
34            temp[k++] = nums[j++];
35        }
36        for(int p = 0;p<temp.length;p++){
37            nums[p+si] = temp[p];
38        }
39        
40    }
41}
42
43
44
45
46