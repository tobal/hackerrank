object Solution {
    def readLineAsInts(): List[Int] = readLine.split(" ").toList.map(_.toInt)
    
    def calcMedian(s: List[Int]): Double = {
        val (lower, upper) = s.sortWith(_<_).splitAt(s.size / 2)
        if (s.size % 2 == 0) (lower.last + upper.head) / 2.0 else upper.head
    }

    def calcMode(s: List[Int]): Int = {
        val bySize = s.groupBy(i => i).mapValues(_.size)
        val maxCount = bySize.maxBy(_._2)._2
        bySize.filter(_._2 == maxCount).minBy(_._1)._1
    }

    def main(args: Array[String]) {
        val c = readInt
        val list = readLineAsInts
        val mean: Double = list.sum / list.length.toDouble
        val median: Double = calcMedian(list)
        val mode = calcMode(list)
        //val stdDeviation = 
        //val confIntervalForMean = 
        println(list)
        println(mean)
        println(median)
        println(mode)
    }
}
