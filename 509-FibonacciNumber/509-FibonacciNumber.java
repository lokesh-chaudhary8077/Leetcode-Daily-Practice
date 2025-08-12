// Last updated: 8/12/2025, 12:26:58 PM
class Solution {
    public int fib(int n) {
       int a = 0;
       int b = 1;
       int sum = 0;
       if(n == 1) return 1;
       if(n == 0) return 0;
       for (int i = 1;i < n;i++){
            sum = a + b;
            a = b;
            b = sum;
       } 
       return sum;
    }
}