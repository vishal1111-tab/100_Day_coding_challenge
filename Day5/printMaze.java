package Day5;

import java.util.Scanner;

public class printMaze {

    public static void printm(int sr , int sc , int dr , int dc , String ans) {
      
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;

        }
        
        if(sc < dc){
            printm(sr , sc+1, dr , dc , ans + 'h');
        }
        if(sr < dr){
            printm(sr+1 , sc, dr , dc , ans + 'v');
        }
       
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int m = scn.nextInt();

      printm(1 , 1 , n , m , "");

    }
}
