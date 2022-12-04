class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int l1 = word1.length(), l2 = word2.length();
        char ch[] = new char[l1+l2];
        
        int i=0, j=0, x=0;
        
        while( i < l1 || j < l2){
            
            if( i < l1){
                ch[x] = word1.charAt(i);
                x++; i++;
            }
            
            if( j < l2){
                ch[x] = word2.charAt(j);
                x++; j++;
            }
            
        }
        
        return new String(ch);
    }
}