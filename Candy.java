1class Solution {
2    public int candy(int[] ratings) {
3        int n=ratings.length;
4        int counts[]=new int[n];
5        Arrays.fill(counts,1);
6        for(int i=1;i<n;i++){
7            if(ratings[i]>ratings[i-1])
8             counts[i]+=counts[i-1];
9        }
10        for(int i=n-2;i>=0;i--){
11            if(ratings[i]>ratings[i+1])
12             counts[i]=Math.max(counts[i],counts[i+1]+1);
13        }
14        int sum=0;
15        for(int i=0;i<n;i++)
16         sum=sum+counts[i];
17        return sum;
18    }
19}