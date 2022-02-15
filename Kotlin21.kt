//21. Отсортировать массив
fun main() {
    val array = arrayOf(1, 3, 2, 4, 6, 5, 8, 7, 9, 10)
    println(sorted(array))
}

fun sorted(array: Array<Int>) {
    val sorted = array.sorted()
    println(sorted)
}
