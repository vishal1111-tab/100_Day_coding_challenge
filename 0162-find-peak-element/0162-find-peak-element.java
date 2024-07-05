class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int lo =0; int hi = nums.length-1;

        while(lo<=hi){
           int mid = (lo + hi)/2;
           if(nums.length==1) return 0;
           if(mid > 0 && mid < n-1){
              if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
              }
              else if(nums[mid] > nums[mid-1]){
                lo = mid + 1;
              }
              else{
                hi = mid -1;
              }
           }

          else if(mid == 0){
            if(nums[mid] > nums[mid+1]){
                return mid;
            }
            else{
                return mid+1;
            }
          }
          else if(mid == n-1){
              if(nums[n-1] > nums[n-2]){
            return n-1;
           }
           else{
            return n-2;
           }
          }
        }
        return 0;
    }
}