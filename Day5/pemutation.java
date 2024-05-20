package Day5;

import java.util.Scanner;

public class pemutation {

    public static void printpermu(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        ///////////////////// 1st Method

        // for(int i=0; i<ques.length(); i++){
        // StringBuilder sb = new StringBuilder(ques);
        // char ch = ques.charAt(i);
        // sb.deleteCharAt(i);
        // String roq = sb.toString();
        // printpermu(roq, ans + ch);
        // }

        ///////////////////////// 2nd Method

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String qlprt = ques.substring(0, i);
            String qrprt = ques.substring(i + 1);
            String roq = qlprt + qrprt;
            printpermu(roq, ans + ch);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        printpermu(str, "");

    }
}
