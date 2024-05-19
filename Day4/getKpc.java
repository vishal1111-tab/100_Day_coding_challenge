package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class getKpc {
    static String[] codes = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getcode(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> lres = getcode(s);

        ArrayList<String> mres = new ArrayList<>();

        String n = codes[ch - '0'];

        for (int i = 0; i < n.length(); i++) {
            for (String s1 : lres) {
                mres.add(n.charAt(i) + s1);
            }
        }
        return mres;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String> words = getcode(str);

        System.out.println(words);

    }
}
