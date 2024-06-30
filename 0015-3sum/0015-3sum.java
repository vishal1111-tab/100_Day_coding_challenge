class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //   Set<List<Integer>> ans = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     Set <Integer> set = new HashSet<>();
        //     for(int j = i+1; j<nums.length; j++){
        //         int rem = -(nums[i] + nums[j]);
        //         if(set.contains(rem)){
        //             List <Integer> lst = Arrays.asList(nums[i] , nums[j] , rem);
        //             Collections.sort(lst);
        //             ans.add(lst);
        //         }
        //         set.add(nums[j]);
        //     }
            
        // }
         
        //  return new ArrayList<>(ans);
          
       List <List<Integer>> ans = new ArrayList<>();   
       Arrays.sort(nums);
       
       for(int i=0; i<nums.length; i++){
         if(i>0 && nums[i] == nums[i-1]) continue;
         int j = i+1;
         int k = nums.length-1;
         while(j<k){
            int sum = nums[i] + nums[j] +nums[k];
            if(sum > 0){
              k--;
            }
            else if(sum < 0){
                j++;
            }
            else{
                List <Integer> lst = Arrays.asList(nums[i] , nums[j] , nums[k]);
                ans.add(lst);
                j++;
                k--;
                while(j < k && nums[j]==nums[j-1]) j++;
                while(j < k &&nums[k] == nums[k+1]) k--;
            }
         }
       }

       return ans;

        
    }
}
