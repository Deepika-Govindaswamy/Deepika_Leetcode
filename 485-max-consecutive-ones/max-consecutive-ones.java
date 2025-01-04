class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int start = 0, end = 0, res = 0;

        while (end < nums.length){
            while (end < nums.length && nums[end] != 0){
                end++;
            }

            res = Math.max(res, end - start);
            start = end + 1;
            end++;
        }

        return res;
    }
}