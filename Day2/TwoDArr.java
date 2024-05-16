package Day2;

import java.util.Scanner;

public class TwoDArr {
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
         System.out.println(arr.length);
         System.out.println(arr.length);
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
     }
}
