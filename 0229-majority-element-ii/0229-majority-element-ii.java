class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List <Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int count = 0;
            if(ans.size()== 0 || ans.get(0) !=nums[i]){
               for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count ++;
                    if(count > (nums.length/3)){
                    ans.add(nums[i]);
                    break;
                }
                } 
            }
               
            }
            if (ans.size() == 2) break;
           
        }
        return ans;
    }
}