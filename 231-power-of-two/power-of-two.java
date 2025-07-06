class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int start = 0, end = n/2;

        while (start <= end) {

            int mid = end + (start - end) / 2;

            if (Math.pow (2, mid) == n) {
                return true;
            }

            else if (Math.pow (2, mid) < n) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        } 

        return false;
    }
}