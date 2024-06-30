class Solution {
    public int search(int[] nums, int k) {
        int lo =  0;
     int hi = nums.length-1;

     while(lo <= hi){
        int mid = (lo + hi)/ 2;
        if(nums[mid] == k) return mid; 
        if(nums[lo] <= nums[mid]){
          if(nums[lo] <= k && nums[mid] >= k){
             hi = mid-1;
          }
          else{
             lo = mid+1;
          }
        }
        else{
            if(nums[mid] <= k && nums[hi] >= k){
             lo = mid+1;
          }
          else{
            hi = mid -1;
          }
        }
     }
     return -1;
     
    }
}