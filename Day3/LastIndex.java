package Day3;

import java.util.Scanner;

public class LastIndex {

    public static int lastind(int y ,int i ,int arr[]){
         if(i == arr.length){
          return -1;
         }
       
   
      int li = lastind(y, i + 1, arr);
     
      if(li == -1){
        if(arr[i] == y){
         return i;
        }
        else{
          return li;
        }
      }
      
     return li;

    }
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int finder = scn.nextInt();
        int arr [] = { 10  , 4 , 4 ,4 , 5};
          
        int ind = lastind(finder , 0,arr);
        System.out.println(ind);
      
      }
}
