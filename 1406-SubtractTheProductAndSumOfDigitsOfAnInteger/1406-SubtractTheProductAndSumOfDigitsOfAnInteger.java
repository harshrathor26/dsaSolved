// Last updated: 5/6/2026, 12:02:04 AM
class Solution {
    public int subtractProductAndSum(int n) {
       int r,sum=0,pro=1;
       while(n>0){
        r=n%10;
        sum=sum+r;
        pro=pro*r;
        n=n/10;
       } 
       return (pro-sum);
    }
}