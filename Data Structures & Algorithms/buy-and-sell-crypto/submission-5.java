class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowest = prices[0];
        for (int right = 0; right < prices.length; right++) {
            lowest = Math.min(prices[right], lowest); 
            maxProfit = Math.max(prices[right] - lowest, maxProfit);
        }

        return maxProfit;
    }
}
