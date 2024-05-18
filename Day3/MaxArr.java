package Day3;

import java.util.Scanner;

public class MaxArr {

    public static int maxArr(int i ,int arr[]){

        if(i == arr.length){
            return -1;
        }

      
      int maxii = maxArr(i + 1, arr);
      if(maxii < arr[i]){
         return arr[i];
      }
      else{
        return maxii;
      }
    }
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr [] = { 10 , 321 , 2  , 454 };

        int maxi = maxArr( 0 ,arr);
        System.out.println(maxi);
      }
}
