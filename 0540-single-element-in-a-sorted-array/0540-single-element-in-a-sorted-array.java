class Solution {
    public int singleNonDuplicate(int[] nums) {
    int n = nums.length;
     if(nums.length==1) return nums[0];

     int lo =0; int hi = nums.length-1;
     if(nums[0] !=nums[1]) return nums[lo];
      if(nums[n-1] != nums[n-2]) return nums[hi];
     while(lo<=hi){
        int mid = (lo + hi)/ 2;
        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
        if(mid % 2 == 1 && nums[mid] == nums[mid-1] || mid %2==0 && nums[mid] == nums[mid+1]){
            lo = mid +1;
        }
        else{
            hi = mid-1;
        }
     }
     return -1;
     
     }
    
}