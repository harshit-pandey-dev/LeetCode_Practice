class Solution {
    public String removeOuterParentheses(String s) {
      String a = "";
      String ans="";
      Stack<Character> st = new Stack<>();
      st.push(s.charAt(0));
      a=a+s.charAt(0);
      for(int i=1;i<s.length();i++){
        char ch = s.charAt(i);
        a=a+ch;
        if(ch=='('){
            st.push(ch);
        }
        if(ch==')' && !st.isEmpty()){
            st.pop();
        }
        if(st.isEmpty() && a.length()>1){
            ans = ans + a.substring(1,a.length() - 1);
            a="";
        } 
      }
      return ans;   
    }
}