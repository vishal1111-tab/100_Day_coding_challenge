class Solution {
    public int maximumGain(String s, int x, int y) {
         int res = 0;
        if(y>x){
        Stack <Character> st = new Stack <>();
       
          for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                if(st.size()>0 && st.peek()=='b'){
                  res+=y;
                  st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        } 
        String st2 = "";
        while(st.size()>0){
            st2 = st.pop()+st2;
        }
        Stack <Character> stac = new Stack <>();
         for(int i=0; i<st2.length(); i++){
            char ch = st2.charAt(i);
            if(ch=='b'){
                if(stac.size()>0 &&stac.peek()=='a'){
                  res+=x;
                  stac.pop();
                }
                else{
                    stac.push(ch);
                }
            }
            else{
                stac.push(ch);
            }
        } 
        }

        else{
        Stack <Character> st = new Stack <>();
          for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='b'){
                if(st.size()>0 && st.peek()=='a'){
                  res+=x;
                  st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        } 
        String st2 = "";
        while(st.size()>0){
            st2 = st.pop()+st2;
        }
        

        Stack <Character> stac = new Stack <>();
         for(int i=0; i<st2.length(); i++){
            char ch = st2.charAt(i);
            if(ch=='a'){
                if(stac.size()>0 &&stac.peek()=='b'){
                  res+=y;
                  stac.pop();
                }
                else{
                    stac.push(ch);
                }
            }
            else{
                stac.push(ch);
            }
        } 
        }
         return res;
        
    }
}