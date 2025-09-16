class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            
            int currentProfit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, currentProfit);
            buy = Math.min (buy, prices[i]);
            
        }

        return maxProfit;
    }
}