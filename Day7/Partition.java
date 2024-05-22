package Day7;

public class Partition {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 9, 4, 8, 3, 6, 2, 1, 5};

        int i = 0;
        int j = 0;
        int pivot = 5;

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
