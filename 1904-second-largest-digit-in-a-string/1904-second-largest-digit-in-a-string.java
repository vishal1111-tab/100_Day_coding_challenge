class Solution {
    public int secondHighest(String s) {
        

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
       
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int dig = ch - '0';
              if(dig> largest){
                slargest = largest;
                largest = dig;
            }
            else if(dig > slargest && dig!= largest){
                slargest = dig;
            }
            }
           
        }
        if(slargest==Integer.MIN_VALUE){
            return -1;
        }
        return slargest;
    }
}