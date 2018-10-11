object Solution {
    
    def calcMean(l: List[Double]): Double = l.foldLeft(0.0)(_ + _) / l.length
    
    def calcMedian(l: List[Double]): Double = {
        val (lower, upper) = l.sortWith(_ < _).splitAt(l.size / 2)
        if (l.size % 2 == 0) (lower.last + upper.head) / 2.0 else upper.head
    }
    
    def calcMode(l: List[Double]): Double = {
        val bySize = l.groupBy(i => i).mapValues(_.size)
        val maxCount = bySize.maxBy(_._2)._2
        bySize.filter(_._2 == maxCount).minBy(_._1)._1
    }

    def main(args: Array[String]) {
        val c = readInt
        val list = readLine.split(" ").toList.map(_.toDouble)
        println(calcMean(list))
        println(calcMedian(list))
        println(calcMode(list).toInt)
    }
}
