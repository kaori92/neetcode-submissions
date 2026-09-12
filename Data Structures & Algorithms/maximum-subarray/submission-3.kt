class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        var max = nums[0]
        var current = nums[0]
        
        for(i in 1..nums.size-1) {
            current = max(nums[i] + current, nums[i])
            if(current > max) {
                max = current
            }
        }
        return max
    }
}
