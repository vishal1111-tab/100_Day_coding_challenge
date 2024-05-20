
// 258. Add Digits
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

// Example 1:

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
// Example 2:

// Input: num = 0
// Output: 0

package Foundation;

import java.util.Scanner;

public class add_digit {


    public static int check_sum(int n){
        int sum =0;
         while(n!=0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
         }
       
         return sum ;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i=0; i<=2; i++){
            num = check_sum(num);
        }

        System.out.println(num);
    }
    }
    

