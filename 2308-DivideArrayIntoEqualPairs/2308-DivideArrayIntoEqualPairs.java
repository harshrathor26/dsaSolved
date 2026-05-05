// Last updated: 5/6/2026, 12:01:53 AM
class Solution {
    public boolean divideArray(int[] nums) {
       Map<Integer,Integer> m= new HashMap<>();
       for(int el:nums){
        if(!m.containsKey(el))m.put(el,1);
        else{
            m.put(el,m.get(el)+1);
        }
       }
       for(int i:m.values()){
        if(i%2!=0)return false;
       } 
       return true;
    }
}