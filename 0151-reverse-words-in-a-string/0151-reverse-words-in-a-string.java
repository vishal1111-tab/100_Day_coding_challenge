class Solution {
    public String reverseWords(String s) {
       String str = s.trim();
        String arr [] = str.split(" ");
        int lo =0; int hi = arr.length-1;
        while(lo<=hi){
            String temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;

        }
        String ans = "";
        for(String x : arr){
            ans = ans + x + " ";
        }
       ans = ans.replaceAll("( )+", " ");
       return ans.trim();
        
        
    }
}