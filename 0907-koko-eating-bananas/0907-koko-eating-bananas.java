//  Brute Force

//class Solution {
//      public static int totalban(int arr[] , int k , int h){
//         int ans = 0;
//         for(int i=0; i<arr.length; i++){
//             float val = (float)arr[i] / k;
//             ans = ans +(int) Math.ceil(val);
//             if(ans  > h){
//                 return 1;
//             }  
//         }
//         return 2;
//     }
//     public int minEatingSpeed(int[] nums, int h) {
//          int maxi = nums[0];
//         for(int i=0; i<nums.length; i++){
//             maxi = Math.max(maxi , nums[i]);
//         }
//         for(int k=1; k<=maxi; k++){
//            if(totalban(nums , k , h) ==2) {
//             return k;
//            }
//         }
//          return -1;
//     }
//

class Solution {

         public static long totalban(int arr[] , long k, int h ){
        long ans = 0;
        for(int i=0; i<arr.length; i++){
            double val = (double)arr[i] / k;
            ans = ans +(long) Math.ceil(val);
        }
        if(ans > h){
            return 2;
        }
       return 0;
        
    }
    public int minEatingSpeed(int[] nums, int h) {
        int maxi = Integer.MIN_VALUE;;
        for(int i=0; i<nums.length; i++){
            maxi = Math.max(maxi , nums[i]);
        }


    long lo = 1; long hi = maxi;
    long ans = 0;
    while(lo <= hi){

        long mid = lo + (hi - lo)/2;
        if(totalban(nums , mid , h) == 0){
            ans = mid;
            hi = mid-1;
        }
        else {
            lo = mid+1;
        }
    }
    return (int)ans;
    }
}