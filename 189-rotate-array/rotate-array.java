class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;

        if (k == 0){
            return;
        }

        int before = (k-1) % n, after = k;

        reverse (nums, 0, n-1);
        reverse (nums, 0, before);
        reverse (nums, after, n-1);
    }

    public void reverse (int[] nums, int start, int end){
        
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--; start++;
        }
    }
}