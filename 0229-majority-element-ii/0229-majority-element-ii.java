class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
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
//   HashMap<Integer, Integer> mpp = new HashMap<>();
//   List<Integer> ls = new ArrayList<>();
//          int n = v.length;
 
//         int mini = (int)(n / 3) + 1;

//         for (int i = 0; i < n; i++) {
//             int value = mpp.getOrDefault(v[i], 0);
//             mpp.put(v[i], value + 1);

//             if (mpp.get(v[i]) == mini) {
//                 ls.add(v[i]);
//             }
//             if (ls.size() == 2) break;
//         }

//         return ls;

       
       int count1 =0;
       int ele1 = 0;
        int count2 =0;
       int ele2 = 0;
        int mini = (int)(nums.length/3);
       for(int i=0; i<nums.length; i++){
        if(count1 == 0 && nums[i] != ele2){
            count1 =1;
            ele1 = nums[i];
        }
        else if(count2 == 0 && nums[i] != ele1){
            count2 =1;
            ele2 = nums[i];
        }
        else if(nums[i] == ele1){
            count1++;
        }
        else if(nums[i] == ele2){
            count2++;
        }
        else{
            count1--;
            count2--;
        }
       }
       
       int c1 = 0;
       int c2 = 0;
       for(int i=0; i<nums.length; i++){
         if(nums[i]==ele1){
            c1++;
         }
         else if(nums[i]==ele2){
            c2++;
         }
       }
       
       List <Integer> res = new ArrayList<>();
       if(c1 > mini){
         res.add(ele1);
       }
       if(c2 > mini){
        res.add(ele2);
       }
       return res;
       
       




    }
}