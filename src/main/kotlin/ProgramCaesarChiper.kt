fun main(args: Array<String>) {
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message: $s")
    var message = ""
    var shif = 1

    for (c in s){
        var i = c.toInt()
        i += shif
        if (i>'z'.toInt()){
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    println("Encypted message: $message")
}