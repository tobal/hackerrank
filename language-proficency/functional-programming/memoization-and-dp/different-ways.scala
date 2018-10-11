object Solution {
    import scala.collection.mutable.Map

    val const: Long = 100000007
    
    val cache: Map[(Int, Int), Long] = Map()
    
    def count(n: Int, k: Int): Long = {
        if (n == k || k == 0) cache.getOrElseUpdate((n, k), 1)
        else cache.getOrElseUpdate((n, k), ((count(n - 1, k - 1) % const + count(n - 1, k) % const) % const))
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt
        for (i <- 0 until cases) {
            println(count(sc.nextInt, sc.nextInt))
        }
    }
}
