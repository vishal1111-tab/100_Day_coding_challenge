class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String fstr = str[0];
        String lstr = str[str.length-1];
        for (int i=0; i<Math.min(fstr.length(), lstr.length()); i++) {
            if (fstr.charAt(i) != lstr.charAt(i)) {
                return ans.toString();
            }
            ans.append(fstr.charAt(i));
        }
        return ans.toString();
    }
}