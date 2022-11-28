class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int min = 9999, flag=-1;
        for( int i = 0; i < points.length; i++){
            if( points[i][0] == x || points[i][1] == y){

                int dist = Math.abs(points[i][0] - x ) + Math.abs(points[i][1] - y) ;
                if( dist < min ){
                    min = dist;
                    flag = i;
                }
            }
        }
        
        return flag;
    }
}