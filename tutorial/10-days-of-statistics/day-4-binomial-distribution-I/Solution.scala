
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
        val p = 1.09/2.09
        val n = 6.0
        val l = for {
            i <- 3 until 7
        } yield binomialDistribution(i, n, p)
        println(l)
    }
}
