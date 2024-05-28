package Day11;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        Stack <Integer> st = new Stack<>();

        for(int i =0; i<arr.length; i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                st.push(j);
            }
            else if(arr[i][j] == 0){
                st.push(i);
            }
        }

        int pot = st.peek();

        for(int i=0; i<arr.length; i++){
            if(i !=pot){
                if(arr[i][pot] == 0 || arr[pot][i]==1){
                    System.out.println("None");
                    return;
                }
                
            }
        }

        System.out.println(pot);
     


    }
    
}
