package Foundation;

import java.util.*;

public class ReverseDigit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
///////////////////ist method
        // String s = Integer.toString(n);
        // String s1 = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        // char ch = s.charAt(i);
        // s1 = s1 + ch;
        // }

        // int res = Integer.parseInt(s1);
        // System.out.println(res);


        ////////////////////2nd method
        
        int d;
        int rev = 0;
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
