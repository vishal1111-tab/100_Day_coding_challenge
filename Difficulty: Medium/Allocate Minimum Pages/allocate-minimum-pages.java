//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.findPages(n, a, m));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   public static boolean isvalidd(int arr[], int mid, int k) {
        int st = 1; // Start with the first student
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                st++; // Assign to a new student
                sum = arr[i];
            }

            if (st > k) {
                return false; // More students required than allowed
            }
        }
        return true; // Valid division
    }

   public static long findPages(int n, int[] arr, int k) {
        int sum = 0;
        int maxPages = 0;

        // Compute the total sum and the maximum pages of a single book
        for (int pages : arr) {
            sum += pages;
            maxPages = Math.max(maxPages, pages); // Find the max pages of a single book
        }

        int lo = maxPages ;
        int hi = sum;
        int ans = -1;

        if (k > n) {
            return -1; // Not enough books for each student
        }

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isvalidd(arr, mid, k)) {
                ans = mid; // `mid` is a valid maximum sum, try for a smaller one
                hi = mid - 1;
            } else {
                lo = mid + 1; // `mid` is too small, try a larger one
            }
        }

        return ans; // Minimum valid maximum sum
    
}
}
