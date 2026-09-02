class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minBuyPrice = Int.MAX_VALUE
        var maxSellPrice = 0
        var currentProfit = 0
        var restOfNumbers = IntArray(prices.size-1)

        // i want a combination of lowest first value and highest value among the rest of the array
        for(j in 0..prices.size-1) {
            if(prices[j]<minBuyPrice) {
                minBuyPrice = prices[j]
            }
            restOfNumbers = prices.sliceArray(j+1..prices.size-1)
            restOfNumbers.sort()
            if(!restOfNumbers.isEmpty()){    
                val last = restOfNumbers.last()
                if(last>maxSellPrice) {
                    maxSellPrice = last
                }
            }
            if(j>0) {
                currentProfit = prices[j] - minBuyPrice
                if(currentProfit>maxProfit) {
                    maxProfit = currentProfit
                }

            }
        }

        if (maxProfit < 0) return 0
        return maxProfit
    }
}
