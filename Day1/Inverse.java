package Day1;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr[] = { 3, 4, 1, 2, 0 };
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            newArr[k] = i;
        }

        for (int res : newArr) {
            System.out.println(res);
        }
    }
}
