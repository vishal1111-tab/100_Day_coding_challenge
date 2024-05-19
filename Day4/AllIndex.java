package Day4;

import java.util.Scanner;

public class AllIndex {

    public static int[] allind(int arr[] , int fin , int count , int inde){
             
        if(inde==arr.length){
            System.out.println(" r" + count);
            return new int[count];
        }
        
        if(fin==arr[inde]){
           
          int iarr[]  = allind(arr, fin , count+ 1 , inde+1);
          System.out.println( "count" + count);
          iarr[count ] = inde;
          return iarr;
        }
        else{
          int iarr[] =   allind(arr, fin , count , inde+1);
          return iarr;
        }
        
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arr [] = {1 , 3 , 4 , 3 };
        int n = arr.length;
        int fin = scn.nextInt();

        int ans[] = allind(arr , fin , 0 , 0);

        for(int val : ans){
            System.out.println(val);
        }
         



       

    }
}
