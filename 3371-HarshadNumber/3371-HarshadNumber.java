// Last updated: 5/6/2026, 12:01:54 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
         int r,sum=0;
         int n=x;
       while(x>0){
        r=x%10;
        sum=sum+r;
        x=x/10;
       } 
       if(n%sum==0)
        return sum;
    else
     return -1;

    }
}