package Day7;

public class Partition {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        // int arr[] = { 7, 9, 4, 8, 3, 6, 2, 1, 5};

        int arr[] = { 0, 1, 1, 1, 1, 0, 0 , 0  , 1};

        int i = 0;
        int j = 0;
        int pivot = 0;

        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                Swap(arr, i, j);
                i++;
                j++;
            }
        }

        for (int res : arr) {
            System.out.println(res);
        }
    }

}
