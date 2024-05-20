package Foundation;

import java.util.*;

public class HappyNo {

    public static int check(int n){
         int sum =0;
         while(n!=0){
            int rem = n % 10;
            sum = sum + (rem*rem);
            n = n/10;
         }
        
         return sum ;
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
         while(num != 1 && num != 4){
           num= check(num);
         }
       if (num==1) {
        System.out.println("True");
       }
       else{
        System.out.println("False");
       }
    }
}
//// reason why num !=4

//Certainly! Let's take a number that is not a happy number, such as 16.

// To determine if a number is happy or not, we repeatedly square each digit and sum them up until we either reach 1 (indicating it's a happy number) or enter a cycle.
//At this point, we have reached 4, and if we continue the process, we will keep getting 4. This forms a cycle: 4 -> 20 -> 42 -> 145 -> 89 -> 58 -> 37 -> 16 -> 4.

// Since we have encountered 4 again, it means the process will keep repeating the same sequence indefinitely. Therefore, 16 is not a happy number, and it gets stuck in a cycle that includes 4.

// This example demonstrates the observation that all numbers that are not happy eventually get stuck in a cycle that includes 4.

//https://chat.openai.com/c/4fed7ff1-56cd-436c-a909-c388790bbd4d