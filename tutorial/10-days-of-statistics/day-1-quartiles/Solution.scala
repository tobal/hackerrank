object Solution {

    def calcMedian(l: List[Int]): Int = {
        val (lower, upper) = l.splitAt(l.size / 2)
        if (l.size % 2 == 0) (lower.last + upper.head) / 2 else upper.head
    }

    def main(args: Array[String]) {
        readInt
        var l = readLine.split(" ").toList.map(_.toInt).sortWith(_ < _)
        val m = calcMedian(l)

        val (lower, upper) = l.splitAt(l.size / 2)
        println(calcMedian(lower))
        println(m)
        if(lower.size == upper.size) {
            println(calcMedian(upper))
        } else {
            println(calcMedian(upper.tail))
        }
    }
}
