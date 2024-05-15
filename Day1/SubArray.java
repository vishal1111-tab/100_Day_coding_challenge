package Day1;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Character arr[] = { 'a', 'b', 'c' };
        for (int k = 1; k <= arr.length; k++) {
            for (int i = 1; i <= arr.length; i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(arr[j - 1]);
                }
                System.out.println();
            }
        }

    }
}
