class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int[] res = new int [n];

        res[n-1] = -1;

        for (int i = n-1; i > 0; i--){
            res[i-1] = Math.max (res[i], arr[i]);
        }

        return res;
    }
}