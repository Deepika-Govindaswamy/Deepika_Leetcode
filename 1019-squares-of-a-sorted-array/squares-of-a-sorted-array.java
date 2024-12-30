class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1, i = nums.length - 1;

        while (left <= right){
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                res[i] = nums[right] * nums[right];
                right--;
            }
            else{
                res[i] = nums[left] * nums[left];
                left++;
            }
            i--;
        }

        return res;
    }
}