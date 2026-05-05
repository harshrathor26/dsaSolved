// Last updated: 5/6/2026, 12:02:27 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
           if(n<=0) 
            return false;
        while(n%2==0)
         n=n/2;
        return n==1;    
}}