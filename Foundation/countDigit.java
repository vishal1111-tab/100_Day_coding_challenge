package Foundation;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
          // m1
        // String s = Integer.toString(n);

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);

        //     int k = c - '0';
        //     System.out.println(k);
        // }

        //m2
        // int count = 0;
        // while(n>0){
        // n = n /10;
        // count++;
        // }

        // System.out.println(count);

     int count = (int)Math.log10(n)+1;
     System.out.println(count);


    }
}
