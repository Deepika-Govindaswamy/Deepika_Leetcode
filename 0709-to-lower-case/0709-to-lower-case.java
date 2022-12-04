class Solution {
    public String toLowerCase(String s) {
        
        char ch[] = s.toCharArray();
        
        for( int i = 0; i < ch.length; i++){
            
            if( (char) ch[i] >= 65 && (char) ch[i] <= 90 ){
                //char ch = (char)(n+32);
               ch[i] = (char) (s.charAt(i)+32);
            }
        }
        
        return new String(ch);
    }
}