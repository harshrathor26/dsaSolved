// Last updated: 5/6/2026, 12:02:16 AM
class Solution {
    public int pivotIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
        int left=0,right=0;
        for(int j=0;j<i;j++)
         left+=nums[j];
        for(int j=i+1;j<nums.length;j++)
         right+=nums[j];
        if(left==right)
         return i;
      }  
      return -1;
    }
}