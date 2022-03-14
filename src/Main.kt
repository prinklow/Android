fun main()
{
    println(checkPalindrome("level"))
    var numbers = arrayOf(50, 12, 42, 3, 22, 35)
    println(findAverage(numbers))

}

fun checkPalindrome(word: String): Boolean
{
    return word.reversed() == word
}

fun findAverage(numbers: Array<Int>): Int
{
    var s = 0
    for (i in numbers.indices step 2)
    {
        if(i == 0) continue
        s += numbers[i]
    }
    return s/((numbers.size-1)/2);
}