fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "Fulscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be tuned on?")
    println(config.contains("shadows"))
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nasound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    println("I would not banish all of these Internets.".substring(2,7))

    println("alpha".compareTo("bravo"))
}