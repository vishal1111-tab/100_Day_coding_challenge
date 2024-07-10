class Solution {

    public static int possArr(int arr[] , int mid){
        int sum =0;
        int count = 1;

        for(int i=0; i< arr.length; i++){
             sum +=arr[i];
            if(sum > mid){
                count ++;
                sum = arr[i];
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        if(nums.length < k){
            return -1;
        }
         int sum = 0;
         int maxi = nums[0];
        for(int x : nums){
           sum+=x;
           maxi = Math.max(maxi , x);
        }

       int lo = maxi;
       int  hi = sum;
      int ans =0;
       while(lo<=hi){
        int mid = (lo + hi)/2;

        if(possArr(nums,mid) <= k){
           ans = mid; 
           hi = mid-1;
        }else{
            lo = mid+1;
        }

       }
      
       return ans;
    }
}