
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
// }

package Day1;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr[] = { 3, 2, 5, 1 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        for (int j = max; j >= 1; j--) {
            for (int k = 0; k < arr.length; k++) {
                if (j <= arr[k]) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
