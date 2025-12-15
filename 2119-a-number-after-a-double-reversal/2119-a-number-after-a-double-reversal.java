class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1=rev(num);
        int r2=rev(r1);
        if(r2==num)
         return true;
        else
         return false;
        }
    
     public int rev(int num){
        int sum=0;
        while(num>0){
            sum=sum*10+num%10;
            num=num/10;
        }
        return sum;
     }
}