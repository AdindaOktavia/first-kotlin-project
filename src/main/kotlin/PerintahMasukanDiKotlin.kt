fun main(args: Array<String>) {
    println("Hi I'm Adinda, the virtual parrot, and i love to repeat!")
    println("Type something in: ")
    var input: String
    input = readLine()!!
    var output: String
    output = input + "," + input + "!"
    println(output)
}