object Solution {
    import scala.collection.mutable.Map

    val cache: Map[Int, Int] = Map(1 -> 1, 2 -> 5)

    def pentagonal(num: Int): Int = cache.getOrElseUpdate(num, 2 * num + (num - 2) + pentagonal(num - 1))

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            println(pentagonal(readInt))
        }
    }
}
