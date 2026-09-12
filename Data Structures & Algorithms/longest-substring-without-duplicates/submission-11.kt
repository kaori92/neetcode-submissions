class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val chars = s.toCharArray()
        val set = mutableSetOf<Char>()
        var start = 0
        var end = 0

        for (i in 0..s.length-1) {
            if(!set.contains(chars[i])){
                set.add(chars[i])
                end++
                if(set.size > maxLength) {
                    maxLength = set.size
                }
            } else {
                // found a duplicate at chars[i]
                while(set.contains(chars[i])) {
                        set.remove(chars[start])
                        start++
                    
                } // removed latest occurrence in substr
                set.add(chars[i])
            }
        }

        return maxLength
    }
}
