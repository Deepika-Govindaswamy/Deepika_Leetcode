class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] res = new int[2];
        int l = 0, r = numbers.length-1;
        
        while( numbers[l] + numbers[r] != target ){
            
            if( numbers[l] + numbers[r] > target ) r--;
            
            else l++;
        }
        
        res[0] = l+1;
        res[1] = r+1;
        
        return res;
    }
}