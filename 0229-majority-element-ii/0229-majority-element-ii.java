class Solution {
    public List<Integer> majorityElement(int[] v) {
        
        // List <Integer> ans = new ArrayList<>();
        
        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     if(ans.size()== 0 || ans.get(0) !=nums[i]){
        //        for(int j=0; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             count ++;
        //             if(count > (nums.length/3)){
        //             ans.add(nums[i]);
        //             break;
        //         }
        //         } 
        //     }
               
        //     }
        //     if (ans.size() == 2) break;
           
        // }
        // return ans;
  HashMap<Integer, Integer> mpp = new HashMap<>();
  List<Integer> ls = new ArrayList<>();
         int n = v.length;
 
        int mini = (int)(n / 3) + 1;

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }

        return ls;
    }
}