import java.util.*;
class Solution {
    public int singleNumber(int[] arr) {
        //   Arrays.sort(arr);
        //   int count =1;
        // for(int i=0; i<arr.length-1; i++){
        //    if(arr[i] == arr[i+1]){
        //       count++;
        //    }
        //    else{
        //        if(count ==2){
        //            count =1;
        //        }
        //        else{
        //            return arr[i];
        //        }
        //    }
        // }
        //    return arr[arr.length-1];
       

       int xor1 = 0;
       for(int i=0; i<arr.length; i++){
        xor1  = xor1 ^ arr[i];
       }
       return xor1;




      












    }
}