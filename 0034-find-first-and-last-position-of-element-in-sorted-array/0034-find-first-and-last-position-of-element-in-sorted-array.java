class Solution {
    public int[] searchRange(int[] nums, int target) {  
        int low = 0;
        int high = nums.length-1;
        int fi = -1;
        int li = -1;
        int arr[] = new int[2];
        while(low<=high){
            int mid = (low+high)/2;
            if(target > nums[mid]){
                low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else{
                 li = mid;
                 low = mid+1;
                
                
            }
        } 
          low = 0;
        high = nums.length-1;
         while(low<=high){
            int mid = (low+high)/2;
            if(target > nums[mid]){
                low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else{
                 fi = mid;
                 high = mid-1;
                
                
            }

        } 
        arr[0]= fi;
        arr[1] = li;
       return arr;
        
    }
    
}
