fun main(args: Array <String>) {
    if (args.size != 3) {
        println("Put just three integer numbers")
        return
    }
    val sides : Array <Int> = arrayOf(args[0].toInt(), args[1].toInt(), args[2].toInt())
    sides.sort()
    if (sides[0] + sides[1] > sides[2]) {
        println("Yes")
    } else {
        println("No")
    }
}