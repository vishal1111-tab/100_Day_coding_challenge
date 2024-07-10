//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
    public static boolean canWePlace(int arr[] , int mid , int k){
        
       int  countCows =1;  int last  = arr[0];
       
       for(int i=1; i<arr.length; i++){
           
           if(arr[i]-last >= mid){
               countCows++;
               last = arr[i];
           }
       }
       
       if(countCows >= k){
           return true;
       }
       return false;
    }
    public static int solve(int n, int k, int[] arr) {
        Arrays.sort(arr);
        
        int lo = 0;
        int hi = arr[n-1] - arr[0];
        int ans =0;
        
        while(lo <=hi){
            int mid = (lo + hi)/2;
             if(canWePlace(arr , mid , k)==false){
                 hi = mid-1;
             }
             else{
                 ans = mid;
                 lo = mid+1;
             }
        }
        return ans;
        
    }
}