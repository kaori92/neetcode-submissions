class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var diff = -1
        val map = HashMap<Int, Int>() // value, index
        var startIndex = 0
        for(i in 0..nums.size-1) {
            // map has (3, 0)
            // (4, 1)
            // (5, 2)
            // (6, 3)
            diff = target - nums[i]
            // now search in dotychczasowe numbers
            if (map.contains(diff)) { // at (4,1)
                result[0] = map.get(diff) ?: -1
                result[1] = i
                return result
            } else {
                // store current elem
                map.put(nums[i], i)
            }
        }
        return result
    }
}
