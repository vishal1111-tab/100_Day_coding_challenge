class Solution {
    public String removeOuterParentheses(String s) {
        
        String res = "";
        Stack <Character> st = new Stack <>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()>0 && ch == ')'){
               if(st.peek() == '('){
                st.pop();
                if(st.size()>0){
                  res = res + ch;
                }
               }
            }
            else if(st.size()==0){
               st.push(ch);
            }
            else if(st.size()>0 && ch =='('){
                st.push(ch);
                res= res + ch;
            }
            
        }
        return res;
    }
}