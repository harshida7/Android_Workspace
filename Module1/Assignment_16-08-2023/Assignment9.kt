fun findMin(list: List<Int>): Int? {
    return list.min()
}

fun findMax(list: List<Int>): Int? {
    return list.max()
}

fun main() {
    val list = listOf(10, 4, 2, 7, 6, 9)

    val min = findMin(list)
    println(min)            // 2

    val max = findMax(list)
    println(max)            // 10
}
