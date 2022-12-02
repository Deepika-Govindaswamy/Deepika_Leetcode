class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if( r*c != mat.length*mat[0].length) return mat;
        
        int temp[] = new int[mat.length*mat[0].length];
        int[][] res = new int[r][c];
        
        int x = 0;
        for(int i = 0; i < mat.length; i++){
            for( int j = 0; j < mat[i].length; j++){
                temp[x] = mat[i][j];
                x++;
            }
        }
        
        for(int i = 0; i < temp.length; i++){
            System.out.print( temp[i] + " ");
        }
        
        x = 0;
        for(int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                res[i][j] = temp[x];
                x++;
            }
        }
        
        return res;
    }
}