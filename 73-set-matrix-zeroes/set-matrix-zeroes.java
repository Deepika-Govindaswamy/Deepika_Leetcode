class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

       List <Integer> res = new ArrayList<>();

        for (int row = 0; row < rowCount; row++){
            for (int col = 0; col < colCount; col++){
                if (matrix[row][col] == 0){
                   res.add(row);
                   res.add(col);
                }
            }
        }

        for (int i = 0; i < res.size(); i+=2){

            int indexRow = res.get(i);
            int indexCol = res.get(i+1);

            // Make row 0
            for (int x = 0; x < colCount; x++){
                matrix[indexRow][x] = 0;
            }
            // Make column 0
            for (int x = 0; x < rowCount; x++){
                matrix[x][indexCol] = 0;
            }
        }
    }
}