package Day10;
import java.util.*;

public class NxtGreToRyt {
    public static void main(String[] args) {
        int arr [] = {2 , 5 ,9,3,1,12,6,8,7};
           
        Stack <Integer> st = new Stack<>();
        int res[] = new int[arr.length];

       for(int j=arr.length-1; j>=0; j--){
         
        while(st.size() > 0 && arr[j] > st.peek()){
            st.pop();
        }
        if(st.size()==0){
            res[j] = -1;
            st.push(arr[j]);
            
        }
        else{
            res[j] = st.peek();
            st.push(arr[j]);
        }
        
       }

       for(int x : res){
         System.out.println(x);
       }
    }

    

    
    
}
