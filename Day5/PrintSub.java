package Day5;

import java.util.Scanner;

public class PrintSub {

    public static void printss(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printss(roq, ans + ch);
        printss(roq, ans + "");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        printss(str, "");

    }
}
