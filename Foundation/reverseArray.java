package Foundation;

import java.util.Arrays;
import java.util.Collections;

public class reverseArray {

    public static void main(String[] args) {

        //////////////////// 1st method
        // Define an array of primitive int values
        // int[] intArray = { 1, 2, 3, 4, 5 };

        // Define an array of Integer objects with the same length as intArray
        // Integer[] integerArray = new Integer[intArray.length];

        // Convert each element of intArray to Integer using autoboxing
        // for (int i = 0; i < intArray.length; i++) {
        // integerArray[i] = intArray[i]; // autoboxing: int to Integer
        // }

        // Arrays.sort(integerArray, Collections.reverseOrder());

        /////////////////////////// 2nd Method
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int arr1[] = new int[arr.length];

        // int i = arr.length - 1;

        // while (i >= 0) {
        // for (int j = 0; j <= arr.length - 1; j++) {
        // arr1[j] = arr[i];
        // i--;
        // }

        // }

        ////////////////////////////// 3rd method

        // int n = arr.length;
        // for(int i = n-1; i>=0; i--){
        // arr1[n-i-1] = arr[i];
        // }

        // for (int val : arr1) {
        // System.out.println(val);
        // }

        /////////////////////// 4 method

        // int[] arr = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] *= -1;
        // }
        // Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] *= -1;
        // }

        // for (int val : arr) {
        //     System.out.println(val);
        // }

        // System.out.println(Arrays.toString(arr));
        // String s = Arrays.toString(arr);
       

    }
}
