object Solution {
    def pentagonal(num: Int): Int = num match {
        case 1 => 1
        case 2 => 5
        case n => 2 * num + (num - 2) + pentagonal(num - 1)
    }

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            println(pentagonal(readInt))
        }
    }
}
