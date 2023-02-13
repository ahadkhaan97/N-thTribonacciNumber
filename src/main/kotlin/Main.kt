fun main() {
    print(tribonacci(25))
    //print(tribonacci2(25))
}

fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    if (n == 2) return 1
    val list = ArrayList<Int>()
    list.add(0)
    list.add(1)
    list.add(1)
    for (i in 2 until n + 1) {
        val sum = list[i] + list[i - 1] + list[i - 2]
        list.add(sum)
    }

    return list[n]
}
