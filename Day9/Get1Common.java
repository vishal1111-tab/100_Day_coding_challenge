package Day9;

import java.util.HashMap;

public class Get1Common {
    public static void main(String[] args) {
        int arr1 [] = {1 ,1 ,2, 2, 2, 5, 5};
        int arr2 [] = {1 , 1 , 1 , 2 , 4 ,5};

         HashMap < Integer , Integer> hm = new HashMap<>();
         
         for(int val : arr1){

            if(hm.containsKey(val)){
             int of =  hm.get(val);
             int nf = of+1;
             hm.put(val,nf);

            }
            else{
                hm.put(val , 1);
            }
         }

         for(int val2 : arr2){
            if(hm.containsKey(val2)){
                System.out.println(val2);
               hm.remove(val2);
                
            }
         }

    }
    
}
