class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            Set <Integer> set = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
                int rem = -(nums[i] + nums[j]);
                if(set.contains(rem)){
                    List <Integer> lst = Arrays.asList(nums[i] , nums[j] , rem);
                    Collections.sort(lst);
                    ans.add(lst);
                }
                set.add(nums[j]);
            }
            
        }
         
         return new ArrayList<>(ans);
        
        
    }
}
