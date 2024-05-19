package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {

    public static ArrayList<String> getStair(int n){
          
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStair(n-1);
        ArrayList<String> path2 = getStair(n-2);
        ArrayList<String> path3 = getStair(n-3);

        ArrayList <String> mres = new ArrayList<>();

        for(String s1 : path1){
            mres.add(1 + s1);
        }
        for(String s2 : path2){
            mres.add(2 + s2);
        }
        for(String s3 : path3){
            mres.add(3 + s3);
        }

        return mres;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        ArrayList<String> path = getStair(n);

        System.out.println(path);

    }
}
