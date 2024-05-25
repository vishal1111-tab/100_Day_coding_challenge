package Day10;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr [] = {9,2,5,19,3,1,12,6,8,7};
           
        Stack <Integer> st = new Stack<>();
        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(st.size()> 0 && arr[st.peek()] < arr[i]){
               st.pop();
            }
            if(st.size()==0){
                res[i] = i+1;  
            }
            else{
               res[i] = i - st.peek();
            }
            st.push(i);
        }

        for(int x : res){
            System.out.println(x);
        }
    }
     
}
