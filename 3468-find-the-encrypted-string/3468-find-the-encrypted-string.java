class Solution {
    public String getEncryptedString(String s, int k) {
       String st = "";

       for(int i=0; i<s.length(); i++){
        int x = (i+k) % s.length();
          char ch = s.charAt(x);
          st+=ch;
       }
       return st;
    }
}