class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         
        List< List <Integer> > ans = new  ArrayList<> ();

         int NoOfSuset = 1<<nums.length;

         for(int i=0; i<=NoOfSuset-1; i++){
            List <Integer> list = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if((i & (1<<j)) !=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
         }
         return ans;
    }
}