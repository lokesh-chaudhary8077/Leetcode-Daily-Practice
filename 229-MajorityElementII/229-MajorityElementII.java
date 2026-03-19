// Last updated: 3/19/2026, 9:06:04 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int count1 = 0;
4        int count2 = 0;
5        int candidate1  = 0;
6        int candidate2 = 0;
7        for(int i = 0;i < nums.length;i++){
8            if(nums[i] == candidate1 ){
9                count1++;
10            }
11            else if(nums[i] == candidate2){
12                count2++;
13            }
14            else if(count1 == 0){
15                candidate1 = nums[i];
16                count1 = 1;
17            }
18            else if(count2 == 0){
19                candidate2 = nums[i];
20                count2 = 1;
21            }
22            else{
23                count1--;
24                count2--;
25            }
26
27        }
28        count1 = 0;
29        count2 = 0;
30        for(int i = 0;i < nums.length;i++){
31            if(nums[i] == candidate1)  count1++;
32            else if(nums[i] == candidate2)  count2++;
33
34        }
35        List<Integer> result = new ArrayList<>();
36        int n = nums.length;
37
38        if (count1 > n / 3) result.add(candidate1);
39        if (count2 > n / 3) result.add(candidate2);
40
41        return result;
42    }
43}