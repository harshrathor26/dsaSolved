class Solution{
    public int reverse(int n){
        long sum=0;
        int sign=1;
         if(n<0) 
        {
            sign=-1;
            n=-n;
        }
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (sum<Integer.MIN_VALUE||sum>Integer.MAX_VALUE)
            return 0;
        sum=sum*sign;
        return (int)sum;
    } 
}