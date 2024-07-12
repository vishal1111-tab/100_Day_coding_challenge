class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int val = hm.getOrDefault(ch , 0);
            hm.put(ch, val + 1);
        }
        List<Character> characters = new ArrayList<>(hm.keySet());
 
        characters.sort((a, b) -> hm.get(b) - hm.get(a));
    
         StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int count = hm.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        
        return result.toString();

    }
}