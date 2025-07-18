class Solution {

    public int pivotIndex(int[] nums) {

        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }    

        int last = prefix.length - 1;
        for (int i = 1; i <= last; i++) {
            
            // check if sum(0,i-1) == sum(i+1, last)
            if (prefix [i-1] == prefix[last] - prefix[i]){
                return i-1;
            } 
        }

        return -1;
    }
}