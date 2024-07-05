class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int x : arr){
            hm.put(x , 1);
        }
        int count = 0;
         int current  = 1;
          while(count < k){
          if(!hm.containsKey(current)){
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