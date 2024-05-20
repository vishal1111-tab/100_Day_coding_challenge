package Day6;

public class Bubble {

    public static Boolean isSmaller(int[] arr, int i, int j) {

        if (arr[i] < arr[j]) {
            return true;
        }
        return false;

    }

    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 9, 8, 2, 1 };

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (isSmaller(arr, j+1, j)) {
                    Swap(arr, j+1, j);
                }
            }
        }

        for (int res : arr) {
            System.out.println(res);
        }

    }

}
