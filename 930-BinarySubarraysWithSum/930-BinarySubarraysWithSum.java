// Last updated: 1/22/2026, 11:38:08 PM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4       int left = 0;
5       long sum = 0;
6       long maxSum = 0;
7       for(int right = 0;right < nums.length;right++){
8        while(set.contains(nums[right])){
9            set.remove(nums[left]);
10            sum -= nums[left];
11            left++;
12        }
13        set.add(nums[right]);
14        sum += nums[right];
15        if(right-left+1 > k){
16            set.remove(nums[left]);
17            sum -= nums[left];
18            left++;
19        }
20        if(set.size() == k){
21        maxSum = Math.max(maxSum,sum);
22        }
23       }
24       return maxSum; 
25    }
26}