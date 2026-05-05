// Last updated: 5/6/2026, 12:02:10 AM
class Solution {
    public int fib(int n) {
        if(n==0)
         return 0;
        else if(n==1||n==2)
         return 1;
        else
         return fib(n-1)+fib(n-2);
    }
}