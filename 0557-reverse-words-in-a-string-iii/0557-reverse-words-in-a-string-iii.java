class Solution {
    public String reverseWords(String s) {
        char[] res = s.toCharArray();
        int i = 0, j = 0;
        
        while( j < res.length){
            if( res[j] == ' '){
                rev(res, i, j-1);
                i = j+1;
            }
            j++;
        }
        
        rev(res, i, j-1);
        
        return new String(res);
    }
    
    public void rev( char[] res, int i, int j){
        int l = i, r = j;
        
        while(l < r){
            char temp = res[l];
            res[l] = res[r];
            res[r] = temp;
            l++; r--;
        }
    }
}