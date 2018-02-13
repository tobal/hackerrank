object Solution {
    def compress(s: String): String = {
        def rec(input: List[Char], acc: List[Char], prev: Char, occurrances: Int): List[Char] = input match {
            case x :: xs => {
                if (x == prev) rec(xs, acc, x, occurrances + 1)
                else if (occurrances > 1) rec(xs, acc ++ List((occurrances + '0').toChar, x), x, 1)
                else rec(xs, acc ++ List(x), x, 1)
            }
            case x :: Nil => {
                if (occurrances > 1) acc ++ List((occurrances + '0').toChar)
                else acc ++ List(x)
            }
            case Nil => {
                if (occurrances > 1) acc ++ List((occurrances + '0').toChar)
                else acc
            }
        }
        val strAsList: List[Char] = s.toList
        rec(strAsList.tail, List(strAsList.head), strAsList.head, 1).mkString
    }

    def main(args: Array[String]) {
        print(compress(readLine))
    }
}
