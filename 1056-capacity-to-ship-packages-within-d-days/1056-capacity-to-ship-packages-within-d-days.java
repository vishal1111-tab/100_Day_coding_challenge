class Solution {

    public static int partiDay(int arr [] , int mid ){
        int sum = 0;
        int day = 1;
        for(int i=0; i< arr.length; i++){
            if(sum + arr[i] > mid){
                day = day +1;
                sum = arr[i];
            }
            else{
                sum = sum + arr[i];
            }
        }
        System.out.println(day + " " + mid);
        return day;
    }
    public int shipWithinDays(int[] nums, int days) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            maxi = Math.max(maxi , nums[i]);
        }

        int sum =0; 
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }

        int lo= maxi; int hi = sum;
        
        int ans = 0;
        while(lo <= hi){
            int mid = (lo + hi)/ 2;

            if(partiDay(nums , mid ) <=days){
                 ans = mid;
                hi =  mid -1;
               
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}