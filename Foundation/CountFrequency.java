package Foundation;

import java.util.*;

public class CountFrequency {
  public static void main(String[] args) {
    Integer arr[] = { 10, 5, 10, 15, 10, 1 };

    Arrays.sort(arr, Collections.reverseOrder());

    int count = 1;
    int i = 0;
    while (i <= arr.length - 2) {
      if (arr[i] == arr[i + 1]) {
        count++;
        i++;
      } else {
        System.out.println(arr[i] + " " + count);
        i++;
        count = 1;
      }
    }
    System.out.println(arr[i] + " " + count);
  }
}
