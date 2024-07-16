class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap <Integer , Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
             int val = hm.getOrDefault(arr[i] , 0);
             hm.put(arr[i] , val+1);
        }
        
        
        Set < Integer> hs = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            hs.add(hm.get(arr[i]));
        }
        if(hm.size()==hs.size()) return true;
        return false;
        
    }
}