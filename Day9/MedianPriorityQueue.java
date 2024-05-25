package Day9;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianPriorityQueue {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };

        PriorityQueue<Integer> lft = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rgt = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (rgt.size() > 0 && rgt.peek() < arr[i]) {
                rgt.add(arr[i]);
            } else {
                lft.add(arr[i]);
            }
            if (lft.size() - rgt.size() >= 2) {
                rgt.add(lft.remove());
            } else if (rgt.size() - lft.size() >= 2) {
                lft.add(rgt.remove());
            }
        }

        if (lft.size() + rgt.size() == 0) {
            System.out.println(-1);
            return;
        } else if (lft.size() >= rgt.size()) {
            System.out.println(lft.peek());
        } else {
            System.out.println(rgt.peek());
        }

    }
}
