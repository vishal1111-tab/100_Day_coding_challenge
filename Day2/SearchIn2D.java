package Day2;

import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int find = scn.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (find == arr[i][j]) {
        //             System.out.println(i + " , " +  j);
        //             return;
        //         }
        //     }
        // }
        // System.out.println("not FOund");

        int i = arr.length-1;
        int j = arr[0].length-1;

        while(i<arr.length && j>=0){
            if(find == arr[i][j]){
                System.out.println(i +  " , " + j);
                return;
             
            }
            else if(find < arr[i][j]){
                j--;
            }
            else {
                i++;
            }
            
        }
     System.out.println("NOT FOUND");





    }

}
