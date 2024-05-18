package Day3;

import java.util.*;

public class StringCompress {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        // int i = 1;
        // System.out.print(str.charAt(0));
        // while(i<str.length()){

        // if(str.charAt(i) == str.charAt(i-1)){
        // i++;
        // }
        // else{
        // System.out.print(str.charAt(i));
        // i++;
        // }

        // }

        int i = 0;
        int count = 1;
        while (i < str.length() - 1 ) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            } else {
                System.out.print(str.charAt(i));
                if (count > 1) {
                    System.out.print(count);
                }
                count = 1;
                i++;
            }
        }
        if(i > 0){
            if (str.charAt(i) != str.charAt(i - 1)) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        }
       else{
        System.out.print(str.charAt(i));
       }
       
    }

}