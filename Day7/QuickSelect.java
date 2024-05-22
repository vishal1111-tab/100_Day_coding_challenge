package Day7;

import java.util.Scanner;

public class QuickSelect {

    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int arr[], int pivot) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                Swap(arr, i, j);
                i++;
                j++;
            }
        }
        return j - 1;

    }

    public static int QuickSele(int arr[], int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = Partition(arr, pivot - 1);
        int index = 0;

        if (k > pi) {
            return QuickSele(arr, pi + 1, hi, k);
        } else if (k < pi) {
            return QuickSele(arr, lo, pi - 1, k);
        } else {
            return arr[pi]
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2 , 9 , 4 , 6};

        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();

        int ans = QuickSele(arr, 0, arr.length - 1, k - 1);

        System.out.println(ans);

    }
}
