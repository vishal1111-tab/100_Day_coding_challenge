package Day1;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int y = scn.nextInt();
        int x = scn.nextInt();

        int i = 0;
        int sum = 0;
        while (n != 0) {
            int q = n / y;
            int rem = n % y;
            sum = sum + (rem * ((int) Math.pow(x, i)));
            i++;
            n = q;
        }
        System.out.println(sum);

    }
}
