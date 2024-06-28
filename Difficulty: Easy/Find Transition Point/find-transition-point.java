//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        
        
        int lo = 0;
        int hi = arr.length-1;
        
        if(arr[lo] == arr[hi] && arr[lo] == 0){
            return -1;
        }
         int tar = 0;
         int li = -1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            
            if(arr[mid] < tar){
                lo = mid+1;
            }
            else if(arr[mid] > tar){
                hi = mid-1;
            }
            else{
                lo = mid+1;
                li = mid;
            }
           
        }
        return li+1;
    }
}