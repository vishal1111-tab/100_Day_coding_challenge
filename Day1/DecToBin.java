package Day1;

import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int dec = scn.nextInt();
        int bin = scn.nextInt();

        String str = "";
        while (n != 0) {
            int q = n / 2;
            int rem = n % 2;
            str = rem + str;
            n = q;

        }
        int res = Integer.parseInt(str);
        System.out.println(res);
    }
}
