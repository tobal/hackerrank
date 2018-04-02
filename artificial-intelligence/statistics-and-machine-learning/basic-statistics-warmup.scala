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

    def calcMeanStd(x: List[Double]): (Double, Double) = {

        @scala.annotation.tailrec
        def meanStd(x: List[Double], mu: Double, Q: Double, count: Int): (Double, Double) = {
            if (count >= x.length) (mu, Math.sqrt(Q / x.length))
            else {
                val newCount = count + 1
                val newMu = x(count) / newCount + mu * (1.0 - 1.0 / newCount)
                val newQ = Q + (x(count) - mu) * (x(count) - newMu)
                meanStd(x, newMu, newQ, newCount)
            }
        }

        meanStd(x, 0.0, 0.0, 0)
    }

    def main(args: Array[String]) {
        val c = readInt
        val list = readLineAsInts
        val (mean, stdDeviation) = calcMeanStd(list.map(_.toDouble))
        val median: Double = calcMedian(list)
        val mode = calcMode(list)
        //val confIntervalForMean =
        println(mean)
        println(median)
        println(mode)
        println("%.1f".format(stdDeviation))
    }
}
