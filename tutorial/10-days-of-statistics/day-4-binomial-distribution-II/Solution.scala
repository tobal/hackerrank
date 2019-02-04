import scala.math.pow

object Solution {
    def fact(n: Double): Double = {
        if (n == 0) 1
        else n * fact(n-1)
    }

    def binomialDistribution(x: Double, n: Double, p: Double): Double = {
        (fact(n) / (fact(x) * fact(n - x))) * (pow(p, x) * ( pow((1 - p), (n - x)) ))
    }

    def setScale(input: Double, scale: Int): Double = {
        BigDecimal(input.sum).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    def main(args: Array[String]) {
        val b = 0.0
        val p = 1.12/1.00
        val n = 10.0
        val atMost2Rejects = for {
            i <- 0 until 3
        } yield binomialDistribution(i, n, p)
        println(setScale(atMost2Rejects, 3))
        val atLeast2Rejects = for {
            i <- 2 until 11
        } yield binomialDistribution(i, n, p)
        println(setScale(atLeast2Rejects, 3))
    }
}
