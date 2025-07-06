class Solution {
    public int possibleStringCount(String word) {
        
        if (word.length() == 1) return 1;

        int count = 1;
        Stack <Character> stack = new Stack<>();

        int i = 1; 
        stack.push(word.charAt(0));

        while (i < word.length()) {

            char curr = word.charAt(i);

            if (stack.peek() == curr) {
                count++;
            }

            else {
                stack.push (curr);
            }

            i++;
        }
        
        return count;
    }

}