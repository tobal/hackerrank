object Solution {
    var cache: Map[Int, Int] = Map(1 -> 1, 2 -> 5)

    def pentagonal(num: Int): Int = {
        if (cache.get(num).isDefined) cache(num)
        else {
            val result = 2 * num + (num - 2) + pentagonal(num - 1)
            cache += (num -> result)
            result
        }
        /*
        if(cache.get(num).isEmpty) {
            cache += (num -> (2 * num + (num - 2) + pentagonal(num - 1)))
        }
        cache(num)
        */
    }

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            println(pentagonal(readInt))
        }
    }
}
