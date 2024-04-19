package Foundation;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();
            int count = 0;
            for (int j = 2; j * j <= n; j++) {

                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count >= 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }

        }

    }
}