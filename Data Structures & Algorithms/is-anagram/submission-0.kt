class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sArray = s.toCharArray()
        sArray.sort()
        val tArray = t.toCharArray()
        tArray.sort()

        // check if arrays have the same elements
        for (i in 0..sArray.size-1) {
            if(sArray[i] != tArray[i]) return false
        }
        return true
    }
}
