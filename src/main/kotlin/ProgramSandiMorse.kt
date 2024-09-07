fun main(args: Array<String>) {
    // Decoder kode Morse
    // String yang ingin kita decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("Pesan asli: $s")

    // String untuk pesan yang telah didecode
    var message = ""

    // Definisi array
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(
        ".-",    // a
        "-...",  // b
        "-.-.",  // c
        "-..",   // d
        ".",     // e
        "..-.",  // f
        "--.",   // g
        "....",  // h
        "..",    // i
        ".---",  // j
        "-.-",   // k
        ".-..",  // l
        "--",    // m
        "-.",    // n
        "---",   // o
        ".--.",  // p
        "--.-",  // q
        ".-.",   // r
        "...",   // s
        "-",     // t
        "..-",   // u
        "...-",  // v
        ".--",   // w
        "-..-",  // x
        "-.--",  // y
        "--.."   // z
    )

    // Memisahkan string menjadi karakter Morse
    val characters = s.trim().split(" ")

    // Iterasi setiap karakter Morse
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // Jika karakter ditemukan
        if (index != -1) {
            message += alphabetChars[index]
        } else {
            // Jika karakter tidak dikenali, tambahkan tanda tanya
            message += "?"
        }
    }

    println("Pesan yang telah didecode: $message")
}
