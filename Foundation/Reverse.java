package Foundation;

import java.util.Scanner;

public class Reverse {

    public static void rotatearr(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();
        
        
        int arr[] = { 1, 2, 3, 4, 5 , 6 ,7};

        k = k % arr.length;
        if(k<0){
            k = k+arr.length;
        }
        rotatearr(arr, 0, arr.length - 1);
        rotatearr(arr, 0, arr.length - k - 1);
        rotatearr(arr, arr.length - k, arr.length - 1); // Corrected this line

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

}
