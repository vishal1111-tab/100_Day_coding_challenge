package Day10;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class SlidingWindow {

    public static void main(String[] args) {
        int arr[]  = {2,8,1,4,3,1,5,9};
        int k = 4;

        Stack <Integer> st = new Stack<>();
         int ng [] = new int[arr.length];

        st.push(arr.length-1);
        ng[arr.length-1] =  arr.length;

        for(int i = arr.length-2; i>=0; i--){
            while(st.peek() > 0 && arr[st.peek()] <= arr[i]){
               st.pop();
            }

            if(st.size()==0){
                ng[i] = arr.length;
            }
            else{
                ng[i] = st.peek();
            }

            st.push(i);
        }
        for(int i=0; i<=arr.length-k; i++){
            int j = i;
            while(ng[j] < i+k){
                j = ng[j];  
            }
            System.out.println(arr[j]);
        }
       

       



        
        
        
        


    }
    
}
