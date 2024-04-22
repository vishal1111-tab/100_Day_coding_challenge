package Foundation;

import java.util.*;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2,  9 };
    ///////////////////////time complexity (nlogn)
        // Arrays.sort(arr);
        // System.out.println(arr[0]);



        //////////////////////////// m2  time complexity 0(n)
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } 
        System.out.println(min);

    }
}
