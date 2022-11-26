class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> fin = new ArrayList<>();
        subseq(nums, 0, new ArrayList<>(), fin);
        return fin;

    }
    
    public void subseq( int[] nums, int i, List<Integer> ans, List<List<Integer>> fin){
        
        if( i >= nums.length){
            fin.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(nums[i]);
        subseq( nums, i+1, ans, fin);
        
        ans.remove(ans.size()-1);
        subseq( nums, i+1, ans, fin);
    }
}