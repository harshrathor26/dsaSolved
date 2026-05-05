// Last updated: 5/6/2026, 12:02:17 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
             sum=sum+i;
            else
             continue;
        }
        if(sum==num)
         return true;
        else
         return false;
    }
}