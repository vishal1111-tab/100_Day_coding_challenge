//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] nums, int n, int target) {
        int low = 0;
        int high = nums.length-1;
        int fi = -1;
        int li = -1;
        int arr[] = new int[2];
        while(low<=high){
            int mid = (low+high)/2;
            if(target > nums[mid]){
                low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else{
                 li = mid;
                 low = mid+1;
                
            }
        } 
          low = 0;
        high = nums.length-1;
         while(low<=high){
            int mid = (low+high)/2;
            if(target > nums[mid]){
                low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else{
                 fi = mid;
                 high = mid-1;
                
                
            }

        } 
        int res = li - fi;
        if(li == -1){
            return 0;
        }
        return res+1;
        
        
    }
}