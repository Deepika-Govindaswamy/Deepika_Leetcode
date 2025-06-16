class NumArray {

    int nums[];

    public NumArray(int[] arr) {
        this.nums = arr;

        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        for (int i : nums){
            System.out.println (i);
        }
    }
    
    public int sumRange(int left, int right) {
        
        if (left == 0){
            return nums[right];
        }

        System.out.println (nums[left - 1]);

        return nums[right] - nums[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */