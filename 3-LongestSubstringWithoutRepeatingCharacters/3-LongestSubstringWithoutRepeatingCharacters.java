// Last updated: 8/11/2026, 1:29:10 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character>set=new HashSet<>();
4        int maxLength=0;
5        int left=0;
6        for(int right=0;right<s.length();right++){
7           
8            if(!set.contains(s.charAt(right))){
9                set.add(s.charAt(right));
10                maxLength=Math.max(maxLength,right-left+1);
11                
12            }else{
13                while(s.charAt(left)!=s.charAt(right)){
14                    set.remove(s.charAt(left));
15                    left++;
16                }
17                set.remove(s.charAt(left));left++;
18                set.add(s.charAt(right));
19            }
20            
21        }
22        return maxLength;
23    }
24}