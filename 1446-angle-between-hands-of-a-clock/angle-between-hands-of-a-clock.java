class Solution {
    public double angleClock(int hour, int minutes) {
        
        // Degrees covered by hours hand and minutes hand 
        // int hourDegree = 30;
        // int minutesDegree = 6;

        double hoursMoved = hour * 30;
        double minutesMoved = minutes * 6; 

        double minutesPosition = (12 + (double)minutes / 5) % 12;

        // the degree hours had moved by the time minutes hand covered minutes degree
        double hoursMovedInMinutes = ((double) minutes/60) * 30;

        double degree = Math.abs (hoursMoved - minutesMoved);
        if (degree <= 0 || minutesPosition < hour){

            degree += hoursMovedInMinutes;
        } 

        else{
            degree = Math.abs (degree - hoursMovedInMinutes);
        }

        return Math.min (degree, 360 - degree);
    }
}