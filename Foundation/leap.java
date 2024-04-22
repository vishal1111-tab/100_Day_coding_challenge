package Foundation;

import java.util.*;

public class leap {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();
        

        boolean b =  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(b);


      

    }
}
