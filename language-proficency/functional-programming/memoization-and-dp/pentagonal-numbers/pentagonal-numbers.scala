object Solution {
    import scala.collection.mutable.Map

    val cache: Map[Long, Long] = Map(1L -> 1L, 2L -> 5L)

    def pentagonal(num: Long): Long = cache.getOrElseUpdate(num, 2 * num + (num - 2) + pentagonal(num - 1))

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            println(pentagonal(readInt))
        }
    }
}
