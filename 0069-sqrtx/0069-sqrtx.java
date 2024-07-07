class Solution {
    public int mySqrt(int x) {
        // int res = 0;
        // for(long i=1; i*i<=x; i++){
        //    res = (int)i;
        // }
        // return res;

        long lo =1; long hi = x;
        long fans = 0;
        
        while(lo <=hi){
          long mid = lo + (hi-lo)/2;
         
           long ans = mid*mid;
           if(ans>x){
            hi = mid-1;
           }
           else if(ans<x){
            fans = mid;
            lo = mid +1;
           }
           else{
            fans = mid;
            break;
           }
 
        }
        return (int)fans;
    }
}