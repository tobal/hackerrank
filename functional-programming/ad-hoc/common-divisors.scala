object Solution {
    def gcd(x: Int, y: Int): Int = if (x == 0) y else gcd(y % x, x)

    def divisors(n: Int): List[Int] = for (i <- List.range(1, n+1) if n % i == 0) yield i

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) {
            val gcdv = gcd(sc.nextInt(), sc.nextInt())
            println(divisors(gcdv).length)
        }
    }
}
