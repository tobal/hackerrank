object Solution {
    def divisors(n: Int): List[Int] = for (i <- List.range(1, n+1) if n % i == 0) yield i

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) {
            val a = divisors(sc.nextInt()).toSet
            val b = divisors(sc.nextInt()).toSet
            println(a.intersect(b).size)
        }
    }
}
