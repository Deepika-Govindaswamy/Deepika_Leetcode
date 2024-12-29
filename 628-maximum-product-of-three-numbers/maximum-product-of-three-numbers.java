class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int i = nums.length - 1;
        if (nums[0] > 0){
            return nums[i] * nums[i-1] * nums[i-2];
        }
        else{
            if (nums[0] < 0 && nums[i] > 0){

                if ((nums[0] * nums[1]) < (nums[i-1] * nums[i-2])){
                    return nums[i] * nums[i-1] * nums[i-2];
                }
                else{
                    return nums[0] * nums[1] * nums[i];
                }
            }
        }
        return nums[i] * nums[i-1] * nums[i-2];
    }
}