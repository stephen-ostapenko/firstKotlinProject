fun main(args: Array <String>) {
    val sides : Array <Int> = arrayOf(args[0].toInt(), args[1].toInt(), args[2].toInt())
    sides.sort()
    for (s in sides) {
        println(s)
    }
}