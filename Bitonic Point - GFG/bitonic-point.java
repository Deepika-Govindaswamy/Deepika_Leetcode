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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        
        int l = 0, r = n-1;
        int mid = 0;
        
        while( l <= r){
            mid = (l + r)/2;
            
            if( (mid == 0 || arr[mid] >= arr[mid-1]) && (mid == n - 1 || arr[mid] >= arr[mid+1])){
                break;
            }
            
            else if( mid > 0 && arr[mid] < arr[mid-1] ){
                r = mid-1;
            }
            
            else{
                l = mid+1;
            }
        }
        
        return arr[mid];
    }
}