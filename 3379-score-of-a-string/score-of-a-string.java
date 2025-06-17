class Solution {
    public int scoreOfString(String s) {
        
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int first = s.charAt(i);
            int second = s.charAt(i+1);
            sum += Math.abs (first - second);
        }

        return sum;
    }
}