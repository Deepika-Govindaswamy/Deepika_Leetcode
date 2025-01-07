class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length () != goal.length()) return false;
        String doubleLengthStr = s + s;

        return doubleLengthStr.contains(goal);
    }
}