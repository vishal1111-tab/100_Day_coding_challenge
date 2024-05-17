package Day2;

import java.util.Scanner;

public class Rotate90 {
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
      
       for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr[0].length; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
       }

          

       for(int i=0; i<arr.length; i++){
        int fi = 0;
        int li = arr[i].length-1;
        while (fi<li) {
            int temp =  arr[i][fi];
            arr[i][fi] =  arr[i][li];
            arr[i][li] = temp;

            fi++;
            li--;
        }
       }

       for(int i=0; i<n; i++){
        for(int j =0; j<m; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }



       




    }
}
