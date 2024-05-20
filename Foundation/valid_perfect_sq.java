package Foundation;

import java.util.Scanner;

public class valid_perfect_sq {


    public static  boolean check(int num){
        long l = 1, r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        ////// method 1
        // int n = (int) Math.sqrt(num);
        // if(n*n==num) return true;
        // else return false;

        //////////// metod 2
        // boolean b = true;
        // for(long i=1 ; i*i<=num; i++){
        // if(i*i==num){
        // b = true;
        // }
        // else{
        // b = false;
        // }
        // }
        // return b;

        /// method3 binary

       boolean b =check(num);
       System.out.println(b);

    }
}
