package org.rmleme.algorithms

@Suppress("NestedBlockDepth", "ReturnCount")
class ValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        s.forEach {
            if (it in "([{") {
                stack.add(it)
            } else {
                when (stack.lastOrNull()) {
                    '(' -> if (it != ')') return false
                    '[' -> if (it != ']') return false
                    '{' -> if (it != '}') return false
                    null -> return false
                }
                stack.removeLast()
            }
        }
        return true
    }
}
