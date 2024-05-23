package Day7;

public class SortZeroOneTwo {

    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 1, 0, 2, 0, 0, 1, 2 };

        int i = 0;
        int j = 0;

        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 1) {
                i++;

            } else if (arr[i] == 0) {
                Swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 2) {
                Swap(arr, i, k);
                k--;
            } else {
                System.out.println("Invalid input in arr");
            }
        }

        for (int res : arr) {
            System.out.println(res);
        }

    }
}
