class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size-1)
    }

    fun binarySearch(arr: IntArray, target: Int, start: Int, end: Int): Int {
        if(start > end) return -1
        var mid = start + (end - start)/2
        if(arr[mid] == target) {
            return mid
        }
        if(arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1)
        }
        if(arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end)
        }
        return -1
    }
}
