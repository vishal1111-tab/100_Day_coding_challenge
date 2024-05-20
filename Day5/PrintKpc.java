package Day5;

import java.util.Scanner;

public class PrintKpc {
    static String[] codes = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printkp(String ques, String ans){
        
        if(ques.length() ==0){
            System.out.println(ans);
            return;
        }


        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String n = codes[ch - '0'];

        for(int i=0; i<n.length(); i++){
            printkp(roq, ans + n.charAt(i));
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        printkp(str, "");

    }

}
