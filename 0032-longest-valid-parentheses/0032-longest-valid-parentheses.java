class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
    int ans=0;
    st.push(-1);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(')
            st.push(i);
        else{
            if(!st.isEmpty())
            st.pop();
            if(!st.isEmpty())
            ans=Math.max(i-st.peek(),ans);
            else
            st.push(i);
        }
    }
    return ans;
    }
}

