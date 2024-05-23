package Day7;

public class SortZeroOne {
   public static void Swap(int arr[], int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

   public static void main(String args[]) {
      int arr[] = { 0, 1, 0, 1, 0, 1 , 0 , 0 , 1 , 1};

      int i = 0;
      int j = 0;

      while (i < arr.length) {
         if (arr[i] == 1) {
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
