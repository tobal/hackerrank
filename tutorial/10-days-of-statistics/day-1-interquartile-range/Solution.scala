object Solution {
    def calcMedian(l: List[Double]): Double = {
            val (lower, upper) = l.splitAt(l.size / 2)
            if (l.size % 2 == 0) (lower.last + upper.head) / 2 else upper.head
    }

    def calcQuartiles(l: List[Double]): (Double, Double, Double) = {
        val median = calcMedian(l)
        val (lower, upper) = l.splitAt(l.size / 2)
        val lowMed = calcMedian(lower)
        val upMed = if(lower.size == upper.size) calcMedian(upper)
            else calcMedian(upper.tail)
        (lowMed, median, upMed)
    }

    def main(args: Array[String]) {
        readInt
        val x = readLine.split(" ").toList.map(_.toDouble)
        val f = readLine.split(" ").toList.map(_.toDouble)
        val expanded = for {
            (value, freq) <- x.zip(f)
        } yield List.fill(freq.toInt)(value)
        val quartiles = calcQuartiles(expanded.flatten.sortWith(_ < _))
        println(quartiles._3 - quartiles._1)
    }
}
