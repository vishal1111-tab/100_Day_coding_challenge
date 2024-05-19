package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubs {

    public static ArrayList<String> gss(String str ){
         
         if(str.length()==0){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;

         }

        char ch = str.charAt(0);
         String sub = str.substring(1);
         ArrayList <String> s1 = gss(sub);
        
         ArrayList <String> mres = new ArrayList<>();

         for(String rres : s1){
            mres.add(""  + rres);
            mres.add(ch  + rres);
         }

         return mres;
    }
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String  str = scn.next();

        ArrayList <String> s = gss(str);
        System.out.println(s);
    }
}
