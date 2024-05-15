package Day1;

import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();

        int arr[] = { 10, 20, 30, 40, 50 , 60, 70, 80};

        int low = 0;
        int high = arr.length - 1;
        int ceil = 0;
        int floor = 0;
      
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < arr[mid]) {
                high = mid - 1;
                floor = arr[mid];
            } else if (k > arr[mid]) {
                low = mid + 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
       
    }
}
