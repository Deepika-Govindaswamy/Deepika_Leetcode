class Solution {
    public int search(int[] nums, int target) {
        
        if( nums.length == 1 && nums[0] == target) return 0;
        
        if( nums.length == 1 && nums[0] != target) return -1;
        
        int l = 0, r = nums.length-1;
        
        while(l <= r){
            int mid = (l+r)/2;
            
            if(nums[mid] == target) return mid;
            
            else if( nums[mid] < target) l = mid+1;
            
            else r = mid-1;
        }
        
        return -1;
    }
}