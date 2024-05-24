package Day8;

public class leet28code {
    public static void main(String[] args) {

        String s1 = "sabdsad";
        String s2 = "sad";

        int i = 0;
        int j = 0;
        int count = 0;
        int ans = -1;

        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                count++;
                i++;
                j++;
                if (count == s2.length()) {
                    ans = (i - count);
                    break;
                }
            } else {
                i = i - count + 1; // Reset i to the next character after the start of the current match attempt
                j = 0;
                count = 0;
            }
        }

        System.out.println(ans);

    }

}
