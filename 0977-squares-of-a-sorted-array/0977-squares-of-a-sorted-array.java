class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0, j = nums.length-1;
        
        
            
            while( i <= j ){
                
                if( i == j ) nums[i] *= nums[i];
                
                else{
                 nums[i] *= nums[i];
                 nums[j] *= nums[j];   
                }
                
                i++; j--;
            }
        Arrays.sort(nums);
        return nums;
        
    }
}