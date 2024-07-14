class Solution {
      public static int countOne(int n){
          int count = 0;
         while(n!=0){
             n = n&n-1;
             count++;
        }
        return count;
        
    }
    public int[] countBits(int n) {
         int arr[] = new int[n+1];
         arr[0]= 0;
        for(int i=1; i<=n; i++){
           int x = countOne(i) ;
           arr[i] = x;
        }
        return arr;
       
    }
}