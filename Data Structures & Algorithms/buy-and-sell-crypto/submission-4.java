class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowest = prices[0];
        for (int right = 0; right < prices.length; right++) {
            if (prices[right] < lowest) lowest = prices[right]; 
            else maxProfit = Math.max(prices[right] - lowest, maxProfit);
        }

        return maxProfit;
    }
}
