//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.setBit(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
         int countZero = 0;
        // int i = 0;
        // int ans = 0;

        // while (n != 0) {
        //     int rem = n % 2;
        //     if (countZero == 0 && rem == 0) {
        //         ans = ans + (1<<i);
        //         countZero++;
        //     } else {
        //         ans = ans + (rem * (1<<i));
        //     }
        //     i++;
        //     n = n / 2;
        // }
        // if (countZero == 0) {
        //     ans = ans + (1<<i);
        // }
        // return ans;
        
        return (n|(n+1));
    }
}