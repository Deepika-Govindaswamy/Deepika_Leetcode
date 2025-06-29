class Solution {
    public int minStartValue(int[] nums) {
        
        int min = nums[0];

        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];

            if (nums[i] < min){
                min = nums[i];
            }
        }

        if (min >= 1){
            return 1;
        }

        return Math.abs(min - 1);
    }
}