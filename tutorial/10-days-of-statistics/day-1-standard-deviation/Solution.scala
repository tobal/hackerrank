object Solution {
    def readLineAsDoubles(): List[Double] = readLine.split(" ").toList.map(_.toDouble)

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
        readInt
        val l = readLineAsDoubles
        println(BigDecimal(calcMeanStd(l)._2).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble)
    }
}
