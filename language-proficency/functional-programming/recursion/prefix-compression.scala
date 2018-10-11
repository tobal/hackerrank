object Solution {
    def main(args: Array[String]) {
        val x = readLine
        val y = readLine
        val prefix = x zip y takeWhile { case(x, y) => x == y } map (_._1) mkString
        println(s"${prefix.size} $prefix")
        println(s"${x.size - prefix.size} ${x.splitAt(prefix.size)._2}")
        println(s"${y.size - prefix.size} ${y.splitAt(prefix.size)._2}")
    }
}
