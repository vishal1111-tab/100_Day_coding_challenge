package Day7;

public class QuickSort {
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

    public static void quick(int arr[], int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = arr[high];
        int pi = Partition(arr, pivot);

        quick(arr, low, pi - 1);
        quick(arr, pi + 1, high); 

    }

    public static void main(String args[]) {
        int arr[] = { 7, 9, 4, 8, 3, 6, 2, 1, 5 };
        int pivot = arr[arr.length - 1];

        quick(arr, 0, arr.length - 1);

        for (int ans : arr) {
            System.out.println(ans);
        }

    }
}
