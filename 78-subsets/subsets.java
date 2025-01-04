class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        int i = 0;

        res = generateSubset (nums, res, tempRes, i);
        System.out.println(res);
        return res;
    }

    public List<List<Integer>> generateSubset (int[] nums, List<List<Integer>> res, List<Integer> tempRes, int i){

        if (i == nums.length){
            res.add(new ArrayList<>(tempRes));
            return res;
        }

        tempRes.add(nums[i]);
        generateSubset (nums,res, tempRes, i+1);
        
        tempRes.remove(tempRes.size()-1);
        generateSubset (nums,res, tempRes, i+1);
        
        return res;
    }
}