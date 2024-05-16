package Day2;

import java.util.Scanner;

public class WaveTraversal {
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
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.print((i % 2 == 0) ? arr[j][i] + " " : arr[n - j - 1][i] + " ");
            }
            System.out.println();
        }

    }
       
}
