class Solution {
    public int singleNumber(int[] nums) {
        
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int i = 0, res = 0;

        while (i < nums.length - 1){
            if (nums[i] == nums[i+1]){
                i += 2;
            }
            else{
                res = nums[i];
                break;
            }
        }

        if (i == nums.length - 1 && nums[i] != nums[i-1]){
            res = nums[i];
        }

        return res;
    }
}