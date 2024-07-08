class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> hm = new HashSet<>();

        for(int x : arr){
            hm.add(x);
        }
        int count = 0;
         int current  = 1;
          while(count < k){
          if(!hm.contains(current)){
            count ++;
             if(count == k){
                return current;
             }
          }
          current++;
        }
        return -1;
       
    }
}