package Day3;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        StringBuilder sb = new StringBuilder(str);

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( 'a'  <= ch && 'z' >= ch){
              char uc =  (char)('A' + ch - 'a');
              sb.setCharAt(i, uc);
            }
            else if( 'A' <= ch && 'Z' >= ch){
                char lc =  (char)('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
            
        }

        String s = sb.toString();
        System.out.println(s);

    }

    
}
