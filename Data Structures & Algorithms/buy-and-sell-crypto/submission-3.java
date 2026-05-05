class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int maxProfit = 0;
        int lowest = prices[0];
        for (int right = 0; right < prices.length; right++) {
            lowest = Math.min(lowest, prices[right]);
            int profit = prices[right] - lowest;
            if (profit < maxProfit) left++;
            else maxProfit = profit;
        }

        return maxProfit;
    }
}
