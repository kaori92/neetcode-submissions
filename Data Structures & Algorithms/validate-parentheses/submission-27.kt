class Solution {
    fun isValid(s: String): Boolean {
        if(s.get(0).equals(']') || s.get(0).equals(')')  || s.get(0).equals('}')) return false
        // if(sequence.startsWith(']') || sequence.startsWith(')' || sequence.startsWith('}'))) return false
        val openBrackets = Stack<Char>()
        val leftOvers = Stack<Char>()
        var textArr = s.toCharArray()
        for (char in s) {
            if(char.equals('[') || char.equals('(')  || char.equals('{')) {
                openBrackets.push(char)
                continue
            }
            val popped = if(!openBrackets.isEmpty) {
                openBrackets.pop() as Char
            } else null

            val closed = if(popped != null)closing(popped) else null
            println("char "+char+" popped  "+popped +" closing(popped) "+closed)
            if(popped != null && !popped.equals(' ') && closed != null && !closed.equals(char)) return false 
            
            if(closed == null) {

                leftOvers.push(char)
            }
            println("leftovers pushing "+char)
            
            // println("pushing "+textArr[i])
        }
        if(!openBrackets.isEmpty() || !leftOvers.isEmpty()) return false
        return true
    }

    fun closing(char: Char): Char? {
        //println("closing of "+char)
            
        if ( char.equals('(')) return ')'
        if ( char.equals('[')) return ']'
        if ( char.equals('{')) return '}'
        return null
    }
}
