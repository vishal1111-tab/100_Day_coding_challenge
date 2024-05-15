package Day1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();

        int arr[] = { 10, 20, 30, 30, 30, 70, 80, 90, 100 };

        int low = 0;
        int high = arr.length - 1;
      
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < arr[mid]) {
                high = mid - 1;
            } else if (k > arr[mid]) {
                low = mid + 1;
            } else {
                System.out.print(mid);
                break;
            }

        }
       
    }
}
