package Foundation;

import java.util.*;

public class Armstrong {

    public static void check(int n) {
        int sum = 0;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - '0';
            sum = sum + (k * k * k);
        }

        if (sum == n) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        // Loop from 100 to 1000 to check Armstrong numbers
        for (int i = 1; i <= 999; i++) {
            check(i);
        }
    }
}


