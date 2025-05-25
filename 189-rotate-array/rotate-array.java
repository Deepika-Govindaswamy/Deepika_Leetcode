class Solution {
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        k = k % len;

        reverse (0, len - 1, nums);

        reverse (0, k-1, nums);
        reverse (k, len - 1, nums);

    }

    public void reverse (int start, int end, int[] arr){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}