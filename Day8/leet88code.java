package Day8;

public class leet88code {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String arr[] = s.trim().split("\\s+");

        int x = arr.length - 1;
        System.out.println(arr[x]);
    }
}
