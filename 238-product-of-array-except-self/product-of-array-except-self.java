class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];

        int  suffix = 1;
        Arrays.fill (answer, 1);

        for (int i = 1; i < answer.length; i++) {
            answer[i] = nums[i-1] *  answer[i-1];
        }


        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i+1];
            answer[i] *= suffix;
        }

        return answer;
    }
}