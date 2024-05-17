package Day1;

import java.util.Scanner;

public class LastInd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();
        int li = -1;
        int arr[] = { 10, 20, 20, 20, 2 0, 20, 20, 80 };

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < arr[mid]) {
                high = mid - 1;

            } else if (k > arr[mid]) {
                low = mid + 1;

            } else {
                li = mid;
                low = mid + 1;
            }

        }
        System.out.println(li);

    }
}
