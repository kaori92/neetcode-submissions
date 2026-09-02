class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minBuyPrice = Int.MAX_VALUE

        for(price in prices) {
            minBuyPrice = minOf(minBuyPrice, price)
            val currentProfit = price - minBuyPrice
            maxProfit = maxOf(maxProfit, currentProfit)
        }

        return maxProfit
    }
}
