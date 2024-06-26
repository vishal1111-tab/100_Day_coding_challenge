package Day2;

import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int arr[][] = new int[r1][c1];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int arr2[][] = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Invalid Input");
            return;
        }

        int prod[][] = new int[r1][c2];

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[i].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += arr[i][k] * arr2[k][j];
                }

            }
        }

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[i].length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

    }
}
