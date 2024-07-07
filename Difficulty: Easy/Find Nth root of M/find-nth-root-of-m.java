//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    
    public static int ans(int i , int n){
          int ans =1;
          
          for(int j =1; j<=n; j++){
             ans = ans * i;
          }
        
        return ans;
    }
    public int NthRoot(int n, int m)
    {
        // code here
        int ans = -1;
        for(int i=1; i<=m; i++){
            
            int x = ans(i,n);
            if(x==m){
                ans = i;
                break;
            }
            else if(x > m){
                return -1;
            }
        }
        return ans;
    }
}