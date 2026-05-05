// Last updated: 5/6/2026, 12:03:01 AM
class Solution {
public:
    bool isPalindrome(int x) {
        long rev=0;
        int n=x;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(x==rev)
           return true;
        else
           return false;

        
    }
};