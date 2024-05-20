package Day5;

import java.util.Scanner;

public class printMazePaths {

    public static void printm(int sr , int sc , int dr , int dc , String ans) {
       if(sr==dr && sc==dc){
        System.out.println(ans);
        return;
       }
      
        for(int i = 1; i<= dc - sc; i++){
            printm(sr , sc+i , dc , dc , ans + 'h' + i);
        }
        for(int i = 1; i<=dr - sr; i++){
            printm(sr+i , sc , dc , dc , ans + 'v' + i);
        }
        for(int i = 1; i<= dr - sr && i <= dc - sc; i++){
            printm(sr+i , sc+i, dc , dc , ans + 'd' + i);
        }
       
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int m = scn.nextInt();

      printm(1 , 1 , n , m , "");

    }
}
