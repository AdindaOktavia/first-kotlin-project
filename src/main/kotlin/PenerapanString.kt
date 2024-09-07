fun main(args: Array<String>) {
    var s = "A programmer gets stuck in the shower because the instructions on the shampo Wash, and Report."
    println(s)
    s = s.toLowerCase()

    var vowelCount = 0
    var consonnantCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjklmpqrstvwxz"

    for (c in s){
        if (vowels.contains(c)){
            vowelCount++
        }else if (consonants.contains(c)){
            consonnantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonnantCount")
    println("Other character: ${s.length - (vowelCount + consonnantCount)}")
}