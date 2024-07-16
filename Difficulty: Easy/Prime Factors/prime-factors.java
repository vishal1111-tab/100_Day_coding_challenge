//{ Driver Code Starts


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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        
      Set <Integer> hs = new HashSet<>();
        for(int i=2; i<=N; i++){
            while(N%i==0){
                 hs.add(i);
                N = N/i;
            }
            
            }
            
        int[] result = new int[hs.size()];
        int index = 0;
        for (int prime : hs) {
            result[index++] = prime;
        }
        
        Arrays.sort(result);
        return result;
            

    }
}