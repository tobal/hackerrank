object Solution {
    import scala.collection.mutable.Map
    
    val const: Long = 100000007

    val cache: Map[Long, Long] = Map(0L -> 0L, 1L -> 1L)

    def fibonacci(num: Long): Long = cache.getOrElseUpdate(num,
        (fibonacci(num - 1) % const + fibonacci(num - 2) % const) % const)

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            val fib = fibonacci(readInt)
            println(fib)
        }
    }
}
