object Solution {
    def main(args: Array[String]) {
        val x = readLine
        val y = readLine
        val l = for { i <- 0 to x.size } yield { x.splitAt(i) }
        val prefix = l.unzip._1.takeWhile(y.startsWith(_)).takeRight(1)(0)
        println(s"${prefix.size} $prefix")
        println(s"${x.size - prefix.size} ${x.splitAt(prefix.size)._2}")
        println(s"${y.size - prefix.size} ${y.splitAt(prefix.size)._2}")
    }
}
