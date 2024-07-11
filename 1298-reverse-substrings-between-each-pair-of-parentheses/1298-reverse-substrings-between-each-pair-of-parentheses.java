class Solution {
    public String reverseParentheses(String s) {
        Stack <Character> st = new Stack<>();
          
        for(int i=0; i<s.length(); i++){
          char ch  = s.charAt(i);
          String pas = "";
          if(ch==')'){
            while(st.size()>0 && st.peek()!='('){
               char ch1 = st.pop();
               pas = pas + ch1;

            }
            st.pop();
            for(int j=0; j<pas.length(); j++){
                st.push(pas.charAt(j));  
            }
            
          }
          else{
            st.push(ch);
          }
        }

        String  ans = "";
        while(st.size()!=0){
            ans = st.pop() + ans;
        }
        return ans;
    }
}