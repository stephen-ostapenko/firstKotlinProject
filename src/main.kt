fun main(args: Array <String>) {
    if (args.size != 3 || args[0].toIntOrNull() == null || args[1].toIntOrNull() == null || args[2].toIntOrNull() == null) {
        println("Put just three positive integer numbers")
        return
    }
    val sides : Array <Int> = arrayOf(args[0].toInt(), args[1].toInt(), args[2].toInt())
    if (sides[0] < 0 || sides[1] < 0 || sides[2] < 0) {
        println("Put just three positive integer numbers")
        return
    }
    sides.sort()
    if (sides[0] + sides[1] > sides[2]) {
        println("Yes")
    } else {
        println("No")
    }
}