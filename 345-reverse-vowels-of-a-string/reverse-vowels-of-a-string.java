class Solution {
    public String reverseVowels(String s) {
        
        int start = 0, end = s.length()-1;
        char[] letters = s.toCharArray();
        
        while (start < end){

            if ( isVowel (letters[start]) && isVowel (letters[end]) ){
                char temp = letters[start];
                letters[start] = letters[end];
                letters[end] = temp;
                start++; end--;
            }

            if ( !isVowel (letters[start]) ){
                start++;
            }

            if ( !isVowel (letters[end]) ){
                end--;
            }
        }


        return new String(letters);
    }

    public boolean isVowel (char ch) {

        String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(ch));
    }
}