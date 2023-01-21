//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    
    void reverse( char[] s, int l, int r){
        while( l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++; r--;
        }
    }
    
    String reverseWords(String S)
    {
        int i = 0, j ;
        char s[] = S.toCharArray();
        
        //System.out.println(String. valueOf(s));
        
        for( j = 0; j < s.length; j++){
            if( s[j] == '.'){
                reverse(s,i,j-1);
                //System.out.println(String. valueOf(s));
                i = j+1;
            }
        }
        
        reverse(s, i, s.length-1);
        reverse(s, 0, s.length-1);
        
        //System.out.println(String. valueOf(s));
        return String.valueOf(s);
    }
}