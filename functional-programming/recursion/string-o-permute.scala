object Solution {
    def switchChars(input: List[Char], output: List[Char]): List[Char] = input match {
        case x1 :: x2 :: xs => switchChars(xs, output ::: List(x2, x1))
        case x :: xs => output ::: List(x)
        case Nil => output
    }

    def main(args: Array[String]) {
        val cases = readInt()
        for (i <- 0 to cases) {
            val s: List[Char] = readLine().toList
            println(switchChars(s, List()).mkString)
        }
    }
}
