fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt
    println("Konversi variabel valInt secara implisit : " +valSum)
    val vallong: Long = valInt.toLong()
    println("Konversi variabel val Int secara eksplisit : " +vallong)
}