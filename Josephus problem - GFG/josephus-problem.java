//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}


// } Driver Code Ends


class Solution
{
   public int josephus(int n, int k)
    {
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=1;i<=n;i++) l.add(i);
        
        int i=0;
        while(l.size()>1){
            i=(i+(k-1));
            i = i %(l.size());
            l.remove(i);
        }
        return l.get(0);
    }

}

