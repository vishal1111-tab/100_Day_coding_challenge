class Solution {
    public int findKthPositive(int[] arr, int k) {

        // brute force Tc => O(n) sc => O(n);
        // Set<Integer> hm = new HashSet<>();

        // for(int x : arr){
        //     hm.add(x);
        // }
        // int count = 0;
        //  int current  = 1;
        //   while(count < k){
        //   if(!hm.contains(current)){
        //     count ++;
        //      if(count == k){
        //         return current;
        //      }
        //   }
        //   current++;
        // }
        // return -1;
        
        // Tc => O(n) sc => O(1);


        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]<=k){
        //         k++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return k;


        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
          int mid = (lo+hi)/2;
          int miss = arr[mid] - (mid + 1);

          if(miss < k){
             lo = mid +1;
          }
          else{
            hi = mid-1;
          }
        }
         
         //evaluate
        // int miss2 = arr[hi] - (hi + 1);
        // int more = k-miss2;
        // int ans = arr[hi] + more;

    //    int ans = hi+1+k; or int ans = lo +k;
       
       int ans = hi +1 +k;
        return ans;

    }
}