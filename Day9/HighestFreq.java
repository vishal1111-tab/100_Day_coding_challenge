package Day9;

import java.util.HashMap;

public class HighestFreq {

    public static void main (String args[]){
        String s = "babcccdabc";

        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
              int coun = hm.get(ch);
              coun++;
              hm.put(ch , coun);
            }
            else{
                hm.put(ch , 1);
            }
        }
        int max = hm.get(s.charAt(0));
        char y = s.charAt(0);
        for(Character x : hm.keySet()){
             int val  = hm.get(x);
             if(val > max){
                max = val;
                y = x;
             }
        }

        System.out.println(y + " -> " + max);
    }
    
}
