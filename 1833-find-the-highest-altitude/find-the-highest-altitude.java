class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] prefix = new int [gain.length + 1];
        int max = 0;

        for (int i = 0; i < gain.length; i++){
            prefix[i+1] = prefix[i] + gain[i];

            if (prefix[i+1] > max){
                max = prefix[i+1];
            }
        }

        return max;
    }
}