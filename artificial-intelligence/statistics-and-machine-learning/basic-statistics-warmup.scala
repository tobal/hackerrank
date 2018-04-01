object Solution {
    def readLineAsInts(): List[Int] = readLine.split(" ").toList.map(_.toInt)
    
    def calcMedian(s: List[Int]): Double = {
        val (lower, upper) = s.sortWith(_<_).splitAt(s.size / 2)
        if (s.size % 2 == 0) (lower.last + upper.head) / 2.0 else upper.head
    }

    def main(args: Array[String]) {
        val c = readInt
        val list = readLineAsInts
        val mean: Double = list.sum / list.length.toDouble
        val median: Double = calcMedian(list)
        val mode = list.groupBy(i => i).mapValues(_.size).maxBy(_._2)._1
        //val stdDeviation = 
        //val confIntervalForMean = 
        println(list)
        println(mean)
        println(median)
        println(mode)
    }
}
