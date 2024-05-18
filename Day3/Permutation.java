package Day3;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        int n = str.length();

        int fact = 1;

        for (int k = n; k >= 1; k--) {
            fact *= k;
        }

        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);

            for (int j = n; j >= 1; j--) {
                int n1 = i;
                int rem = n1 % j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                n1 = n1 / j;
            }
            System.out.println();
        }

    }
}
