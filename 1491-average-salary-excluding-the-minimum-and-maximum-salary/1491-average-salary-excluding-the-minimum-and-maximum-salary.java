class Solution {
    public double average(int[] salary) {
        
        double max = salary[0], min = salary[0], sum = 0;
        
        for( int i = 0; i < salary.length; i++){
            
            if( max < salary[i] ) max = salary[i];
            if( min > salary[i] ) min = salary[i];
            sum += salary[i];
        }
        
        sum = sum - (min+max);
        
        return( sum/(salary.length-2));
}
}