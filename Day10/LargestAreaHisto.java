package Day10;

import java.util.*;

public class LargestAreaHisto {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        Stack<Integer> st = new Stack<>();
        int rb[] = new int[arr.length];

        int lb[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);

        }
        st = new Stack<>();

        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = arr.length;

            } else {
                rb[i] = st.peek();

            }
            st.push(i);

        }


        int maxArea = 0;

        for(int i=0; i<arr.length; i++){
            int w = rb[i] -lb[i] -1;
            int area = arr[i] * w;
            if(area > maxArea){
                maxArea = area;
            }
        }

        System.out.println(maxArea);

    }

}
