class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size-1)
    }

    fun binarySearch(arr: IntArray, target: Int, start: Int, end: Int): Int {
        if(start > end) return -1
        var mid = start + (end - start)/2
        println("target: $target arr: ${arr.contentToString()}")
        println("val at mid: $mid is: ${arr[mid]}")
        println("start $start end $end mid $mid")
        if(arr[mid] == target) {
            println("found target at index: $mid")
            return mid
        }
        if(arr[mid] > target) {
            println("current element larger than target, searching array now with indexes $start and ${mid-1}")
            return binarySearch(arr, target, start, mid - 1)
        }
        if(arr[mid] < target) {
            println("current element smaller than target, searching array now with indexes ${mid+1} and ${end}")
            return binarySearch(arr, target, mid + 1, end)
        }
        return -1
    }
}
