class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++){
            int start = i+1, end = nums.length - 1;

            while (start < end){

                int sum = nums[start] + nums[i] + nums[end];

                if (Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }

                if (sum > target){
                    end--;
                }
                else if (sum < target){
                    start++;
                }
                else{
                    return sum;
                }
            }
        }

        return closestSum;
    }
}