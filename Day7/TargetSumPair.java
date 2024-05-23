package Day7;

import java.util.*;

public class TargetSumPair {

    public static void main(String args[]) {
        int arr[] = { 7, 15, 3,  3 , 18, 6, 4, 19, 2, 12, 11, 9 };
        int target = 15;
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " -> " + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else if(arr[i] + arr[j] < target) {
                i++;
            }

        }
    }
}
