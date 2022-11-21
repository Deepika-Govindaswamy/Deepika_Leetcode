class Solution {
    public int maxProductDifference(int[] nums) {
        
        int i = nums.length-1;
        Arrays.sort(nums);
        
        return( (nums[i]*nums[i-1]) - (nums[0]*nums[1]));
    }
}