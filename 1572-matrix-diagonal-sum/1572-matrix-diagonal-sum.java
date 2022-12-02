class Solution {
    public int diagonalSum(int[][] mat) {
        
        if( mat.length == 1) return mat[0][0];
        
        int sum = 0;
        for( int i = 0; i < mat.length; i++){
            sum += mat[i][i];
            mat[i][i] = -1;
        }
       
        
        int i=0, j=mat.length-1; 
        while(j >= 0){
            if( mat[i][j] != -1){
                sum += mat[i][j];
            }
            i++; j--;
        }
        return sum;
    }
}