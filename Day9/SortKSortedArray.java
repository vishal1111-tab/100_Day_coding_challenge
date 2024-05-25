package Day9;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = { 2, 3, 1, 4, 6, 7, 5, 8, 9 };
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);

        }
        int j = k + 1;

        while (j < arr.length) {
            System.out.println(pq.peek());
            pq.remove();
            pq.add(arr[j]);
            j++;
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }

    }

}
