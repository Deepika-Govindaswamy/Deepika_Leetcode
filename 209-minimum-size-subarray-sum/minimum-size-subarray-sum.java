class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start = 0, end = 0, length = Integer.MAX_VALUE;
        int sum = 0;
        
        while (end < nums.length) {
            sum += nums[end];

            if (sum < target) {
                end++;
            } 

            else {
                length = Math.min (length, end-start+1);
                start++;
                end=start;
                sum = 0;
            }
        }

        length = (length == Integer.MAX_VALUE) ? 0 : length;

        return length;
    }
}