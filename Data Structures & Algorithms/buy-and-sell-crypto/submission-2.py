class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_value = 0
        max_profit = 0
        for index in range(len(prices) - 1, -1, -1):
            max_value = max(prices[index], max_value)
            max_profit = max(max_value - prices[index], max_profit)

        return max_profit
    
            