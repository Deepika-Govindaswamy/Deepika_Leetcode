class Solution {
    public char findTheDifference(String s, String t) {
        
        int s1 = 0, t1 = 0;
        
        for( int i = 0; i < s.length(); i++){
            s1 += s.charAt(i);
        }
        
        for( int i = 0; i < t.length(); i++){
            t1 += t.charAt(i);
        }
        
        return (char)(t1-s1);
    }
}