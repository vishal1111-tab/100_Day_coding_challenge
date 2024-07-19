class Solution {
    public int removeDuplicates(int[] nums) {
        
      HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int val = hm.getOrDefault(nums[i] , 0);
            if(val < 2){
              hm.put(nums[i] , val+1);
            }
        }

        List <Integer> list = new ArrayList<>();
        
        for(int x : hm.keySet()){
            int val2 = hm.get(x);
            for(int i=0; i<val2; i++){
                list.add(x);
            }
        }
        Collections.sort(list);
        
       
        for(int i=0; i< list.size(); i++){
            nums[i] = list.get(i);
        }
        
        return list.size();
    }
}