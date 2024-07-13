class Solution {
    public int maxDepth(String s) {

        Stack <Character> st = new Stack<>();
        int maxi  =0; 
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==')'){
                 st.pop();
                 count--;
              
            }
            else if(ch=='('){
                count ++;
                maxi = Math.max(maxi , count);
                st.push(ch);
            }
        }
        return maxi;
    }
}