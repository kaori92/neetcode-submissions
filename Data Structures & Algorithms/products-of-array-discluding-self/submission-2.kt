class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size)
        var productOfAll = 1
        var productNoZeros = 1
        var allZeros = true
        var zerosCount = 0

        for (i in nums.indices) {
            if(nums[i] != 0){
                productNoZeros *= nums[i]
            } else {
                zerosCount++
            }
            productOfAll *= nums[i]
        }

        println(" product $productOfAll productNozEros $productNoZeros")

        for (i in nums.indices) {
            if(nums[i] == 0 && zerosCount == 1) {
                //looking at 0, other nums are positive/negative
                output[i] = productNoZeros
                continue
            }

            if(productOfAll != 0) {
               output[i] = productOfAll/nums[i]
            } else { // has 0 somewhere
                if(nums[i] != 0) {
                    output[i] = 0
                } else { // current elem is 0
                    println("current elem is 0, product $productOfAll productNozEros $productNoZeros")
                    if(zerosCount > 1) {
                        output[i] = 0
                    } else {
                        //current elem is the only zero
                        output[i] = productNoZeros
                    }
                }
            }
        }

        return output
    }
}
