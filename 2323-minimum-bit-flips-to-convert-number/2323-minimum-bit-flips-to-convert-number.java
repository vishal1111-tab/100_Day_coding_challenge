class Solution {
   
    public int minBitFlips(int start, int goal) {
        int count =0;
        int n = start^goal;
        System.out.println(n);
       while(n!=0){
        System.out.println(n);
         if(n % 2 == 1){
            count ++;
         }
         n = n/2;
       }
       return count;

    }
}