class Solution {

    public static int  bs(int arr[] , int l , int h , int tar){
      
      if(l > h){
        return -1;
      }
      int mid = l + (h-l)/2;

      if(tar > arr[mid]){
        return bs(arr , mid+1 , h , tar);
      }
      else if(tar < arr[mid]){
         return bs(arr , l , mid-1 , tar);
      }
      else{ 
        return mid;
      }

    }
    public int search(int[] nums, int target) {
         int l = 0;
         int h = nums.length-1;
         return bs(nums , l , h , target);
    }
}