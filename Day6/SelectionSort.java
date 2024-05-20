package Day6;

public class SelectionSort {
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

        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                 if(isSmaller(arr, j, min)){
                    min = j;
                 }
            }
            Swap(arr , i , min);
        }

        for (int res : arr) {
            System.out.println(res);
        }

    }
}
