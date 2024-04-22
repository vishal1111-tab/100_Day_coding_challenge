package Foundation;

import java.util.*;

public class min_max {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (n != 0) {
            int rem = n % 10;
            //// 1st method
            // if (rem > max) {
            // max = rem;
            // }
            // if (rem < min) {
            // min = rem;
            // }
            //// 2nd method
            max = Math.max(max, rem);
            min = Math.min(min, rem);
            n = n / 10;
        }

        System.out.println(min);
        System.out.println(max);
    }

}
