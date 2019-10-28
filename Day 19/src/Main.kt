import java.util.*

fun main(args: Array<String>) {
    val input = readLine()!!.toCharArray()
    val solution = Solution()
    input.forEach {
        solution.pushCharacter(it)
        solution.enqueueCharacter(it)
    }

    var isPalindrome: Boolean = true
    for (i in 0 until input.size){
        val queueCh = solution.dequeueCharacter()
        val stackCh = solution.popCharacter()

        println("Queue: $queueCh, Stack: $stackCh")

        if (queueCh != stackCh) {
            isPalindrome = false
            break
        }
    }

    println("The word ${ input.joinToString("") }, is ${ if (isPalindrome) "a palindrome" else "not a palindrome" }")
}

class Solution {
    private val stack: Stack<Char> = Stack()
    private val queue: Queue<Char> = LinkedList()

    fun pushCharacter(ch: Char) {
        stack.push(ch)
    }

    fun enqueueCharacter(ch: Char) {
        queue.add(ch)
    }

    fun popCharacter(): Char = stack.pop()

    fun dequeueCharacter(): Char {
        return queue.poll()
    }

}