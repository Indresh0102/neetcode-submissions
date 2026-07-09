class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)      
        min_price = [0]*n
        min_price[0] = prices[0]
        max_price = [0]*n
        max_price[n-1] = prices[n-1]

        for i in range(1,n):
            min_price[i] = min(min_price[i-1], prices[i])
            max_price[n-i-1] = max(max_price[n-i], prices[n-i-1])

        res = 0
        for i in range(n):
            res = max(res, max_price[i]-min_price[i])

        return res