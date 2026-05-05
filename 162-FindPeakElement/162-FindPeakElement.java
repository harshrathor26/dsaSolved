// Last updated: 5/6/2026, 12:02:34 AM
class Solution {
    public int findPeakElement(int[] a) {
        int start=1;
        int n = a.length;
        if(n==1)return 0;
        if(a[0]>a[1])return 0;
        if(a[n-1]>a[n-2])return n-1;
        int end=n-2;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                return mid;
            }
            if(a[mid]<a[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
           
        }
        return 0;
    }
}