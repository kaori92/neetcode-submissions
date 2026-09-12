class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val chars = s.toCharArray()
        val set = mutableSetOf<Char>()
        var start = 0
        var end = 0
        var longestSub = ""

        for (i in 0..s.length-1) {
            if(!set.contains(chars[i])){
                set.add(chars[i])
                end++
                if(set.size > maxLength) {
                    maxLength = set.size
                }

                println("at char ${chars[i]} maxLength: $maxLength set ${set.toString()}")
            } else {
                // found a duplicate at chars[i]
                while(set.contains(chars[i])) {
                // println(" while, index: $index chars[index] ${chars[index]} comparing with ${chars[i]}")
                        set.remove(chars[start])
                        start++
                    
                } // removed latest occurrence in substr
                set.add(chars[i])
            }
        }

        return maxLength
    }
}
