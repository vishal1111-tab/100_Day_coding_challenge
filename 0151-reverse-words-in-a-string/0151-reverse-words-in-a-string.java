class Solution {
    public String reverseWords(String str) {
       str = str.trim();
       str = str.replaceAll("( )+", " ");
       String arr [] = str.split(" ");
       String ans = "";
       for(int i = arr.length-1; i>0; i--){
         ans+=arr[i] + " ";
       }
       return ans + arr[0];
  
        
    }
}