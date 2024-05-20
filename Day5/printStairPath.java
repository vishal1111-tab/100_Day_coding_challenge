package Day5;

import java.util.Scanner;

public class printStairPath {

    public static void printStair(int n ,  String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if(n<0){
            return;
        }

       printStair(n-1, ans + 1);
       printStair(n-2, ans + 2);
       printStair(n-3, ans + 3);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        printStair(n  , "");

    }
}
