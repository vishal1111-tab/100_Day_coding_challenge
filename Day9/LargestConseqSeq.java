package Day9;

import java.util.HashMap;

public class LargestConseqSeq {
    public static void main(String[] args) {
        int arr1[] = { 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2 };
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int val : arr1) {
            hm.put(val, true);
        }

        for (int val : arr1) {
            if (hm.containsKey(val - 1)) {
                hm.put(val, false);
            }
        }

        int msp = 0;
        int ml = 0;
        for (int val : arr1) {
            if (hm.get(val) == true) {
                int tp = val;
                int tl = 1;

                while (hm.containsKey(tp + tl)) {
                    tl++;
                }
                if (tl > ml) {
                    ml = tl;
                    msp = tp;
                }
            }

        }
        for (int i = 0; i < ml; i++) {
            System.out.println(msp + i);
        }

    }

}
