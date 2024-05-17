package Day2;

import java.util.Scanner;

public class RightDiagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
      

        int arr[][] = new int[n][m];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
      
        for(int i=0; i<arr.length; i++){
            int g = 0;
            for(int j =i; j<arr[0].length; j++){
                System.out.print(arr[g][j] + " ");
                g++;
            }
            System.out.println();
        }




    }
}
