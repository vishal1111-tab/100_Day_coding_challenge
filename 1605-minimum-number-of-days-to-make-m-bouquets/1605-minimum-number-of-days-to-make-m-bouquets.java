class Solution {
    public static int possibleans(int arr[] , int mid , int k){
        int count = 0;
        int ans = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] <= mid){
                count++;
                if(count == k){
                    ans ++;
                    count = 0;
                }
            }
            else{
                count =0;
            }
        }
    
        return ans;
    }
    public int minDays(int[] nums, int m, int k) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxi = Math.max(nums[i] , maxi);
        }
        int lo= 1;
        int hi = maxi;
        int ans = -1;
        while(lo<=hi){
           int mid = (lo + hi)/2;

           if(possibleans(nums , mid , k) >= m){
               ans = mid;
               hi = mid-1;
           }
           else{
                lo = mid +1;  
           }
        }
        return ans;
    }
}