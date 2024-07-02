class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
         HashMap <Integer,Integer> hm = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i<arr2.length; i++){
            
            if(hm.containsKey(arr2[i])){
                int x = hm.get(arr2[i]);
                int nf = x+1;
                hm.put(arr2[i] , nf);
            }
            
            else{
                hm.put(arr2[i],1);
            }  
        }
            for(int i=0; i< arr1.length; i++){
                if(hm.containsKey(arr1[i]) && hm.get(arr1[i])>0){
                   list.add(arr1[i]);
                int x = hm.get(arr1[i]);
                int nf = x-1;
                hm.put(arr1[i] , nf);
                }
            }
            
            int res[] = new int[list.size()];
            
        for(int i=0; i<res.length; i++){
            res[i] = list.get(i);
        }
            return res;
    }
}