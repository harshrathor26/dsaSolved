// Last updated: 5/6/2026, 12:02:50 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')st.push(')');
            else if(c=='{')st.push('}');
            else if(c=='[')st.push(']');
            else if(st.isEmpty()||st.pop()!=c)return false;
        }
        return st.isEmpty();
    }
}