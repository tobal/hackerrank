import scala.math.pow

object Solution {
    def fact(n: Double): Double = {
        if (n == 0) 1
        else n * fact(n-1)
    }

    def binomialDistribution(x: Double, n: Double, p: Double): Double = {
        (fact(n) / (fact(x) * fact(n - x))) * (pow(p, x) * ( pow((1 - p), (n - x)) ))
    }

    def main(args: Array[String]) {
        val b = 0.0
        val p = 1.12/1.00
        val n = 10.0
        val atMost2Rejects = for {
            i <- 0 until 3
        } yield binomialDistribution(i, n, p)
        println(BigDecimal(atMost2Rejects.sum).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble)
        val atLeast2Rejects = for {
            i <- 2 until 11
        } yield binomialDistribution(i, n, p)
        println(BigDecimal(atLeast2Rejects.sum).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble)
    }
}
