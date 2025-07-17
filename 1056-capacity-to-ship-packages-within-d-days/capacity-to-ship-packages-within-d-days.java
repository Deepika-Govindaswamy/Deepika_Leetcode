class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minCap = 1, maxCap = 0;

        // calculate maximum capacity of ship
        for (int i : weights) {
            maxCap += i;
            minCap = Math.max (minCap, i);
        }

        while (minCap < maxCap) {
            
            int currentCapacity = minCap + (maxCap - minCap) / 2;
            boolean canShip = possibility (weights, days, currentCapacity);

            if (canShip) {
                
                maxCap = currentCapacity;
            }

            else {
                minCap = currentCapacity + 1;
            }
        }

        return minCap;
    }

    public boolean possibility (int[] weights, int days, int capacity) {

        int totalDays = 1,  weightPerDay = 0;

        for (int w : weights) {

            weightPerDay += w;

            if (weightPerDay > capacity) {
                totalDays++;
                weightPerDay = w;

                if (totalDays > days) {
                    return false;
                }
            }
            
        }

        return true;
    }
}