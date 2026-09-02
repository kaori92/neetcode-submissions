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
            println("j $j prices[j] ${prices[j]}")
            //println("j $j prices[j] ${prices[j]} maxSellPrice $maxSellPrice minBuyPrice $minBuyPrice maxProfit $maxProfit ")
            //println("restOfNumbers ${restOfNumbers.contentToString()}  ")
            if(!restOfNumbers.isEmpty()){    
                val last = restOfNumbers.last()
                if(last>maxSellPrice) {
                    maxSellPrice = last
                }
            }
            if(j>0) {
                println("currentProfit before: $currentProfit assigning prices[j] ${prices[j]} - minBuyPrice $minBuyPrice")
                currentProfit = prices[j] - minBuyPrice
                println("currentProfit after $currentProfit maxProft $maxProfit ")
                if(currentProfit>maxProfit) {
                    maxProfit = currentProfit
                }

            }
        }

        
        //maxProfit = maxSellPrice - minBuyPrice
//println("at end: maxSellPrice $maxSellPrice minBuyPrice $minBuyPrice maxProfit $maxProfit")
        if (maxProfit < 0) return 0
        return maxProfit
    }
}
