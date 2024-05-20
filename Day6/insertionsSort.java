package Day6;

public class insertionsSort {
    public static Boolean isGreater(int[] arr, int i, int j) {

        if (arr[i] > arr[j]) {
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

          for(int i=1; i<arr.length; i++){
            for(int j = i; j >=1; j--){
                if(isGreater(arr , j-1, j)){
                    Swap(arr , j ,j-1);
                }
            }
          }

        for (int res : arr) {
            System.out.println(res);
        }

    }
}
