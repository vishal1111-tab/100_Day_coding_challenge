package Day9;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLarrget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = {2, 10, 5, 17, 7, 18, 6, 4 };
        int k = scn.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            if(i<k){
                pq.add(arr[i]);
            }

            else{
                if(arr[i] > pq.peek()){
                  pq.remove();
                  pq.add(arr[i]);
                }
            }
        }
        System.out.println(pq);

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }



    }

}
