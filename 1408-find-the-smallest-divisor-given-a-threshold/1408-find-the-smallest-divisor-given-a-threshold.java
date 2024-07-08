class Solution {
    public static long pernum(int arr[] , long k){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            double val =(double) arr[i] / k;
            ans += Math.ceil(val);
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxi = Math.max(nums[i] , maxi);
        }

        long lo =1; long hi = maxi;
        long ans = 0;
        while(lo<=hi){
            long mid = (lo + hi)/2;
           
           if(pernum(nums , mid) <= threshold){
              ans = mid;
              hi = mid-1;
           }
           else{
               lo = mid +1;
           }
        }
        return (int)ans;
    }
}