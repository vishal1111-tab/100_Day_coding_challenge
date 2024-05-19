package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static ArrayList<String> getMaze(int sr , int sc , int dr , int dc) {
         
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;  
        }
        ArrayList<String> horiz = new ArrayList<>();
        ArrayList<String> verti = new ArrayList<>();
        if(sc < dc){
             horiz = getMaze(sr , sc+1 , dr , dc);
        }
        
        if(sr < dr){
             verti =   getMaze(sr + 1 , sc , dr , dc);
        }
          ArrayList <String> mres = new ArrayList<>();
          
          for(String path : verti){
            mres.add("v" + path);
          }
          for(String path : horiz){
            mres.add("h" + path);
          }
        return mres;
    }
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();
       int m = scn.nextInt();

       ArrayList<String> paths =  getMaze(1 , 1 , n  , m);
       for(String s : paths){
        System.out.println(s);
       }
    }
}
