package Day3;

import java.util.Scanner;

public class FirstInd {

    public static int findex(int y ,int i ,int arr[]){
        
        // if(i == arr.length){
        //     return -1;
        // }
        ////////////////ist method
        // int x = findex( y , i + 1, arr);
        // if(arr[i] == y){
        //     return i;
        // }
        // else{
        //     return x;
        // }
   //////////////////////2nd method

        if(arr[i] == y){
            return i;
        }
        System.out.println("b");
        int x = findex( y , i + 1, arr);
        System.out.println("a");
        return x;
    }
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int finder = scn.nextInt();
        int arr [] = { 10 , 10 , 3 , 3};
          
        int ind = findex(finder , 0,arr);
        System.out.println(ind);
      
      }
}
