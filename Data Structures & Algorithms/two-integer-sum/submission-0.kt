class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var diff = -1
        for(i in 0..nums.size-1) {
            diff = target - nums[i]
            // now search in the rest of the array if diff exists
            
            // rest of array:
            for(j in i+1 .. nums.size-1){
                if(nums[j] == diff) {
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}
