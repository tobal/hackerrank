object Solution {
    def readLineAsInts(): Array[Int] = readLine.split(" ").map(_.toInt)

    def main(args: Array[String]) {
        val first = readLineAsInts
        val arraySize = first(0)
        val queriesCount = first(1)
        val array = readLineAsInts
        val ranges = for (_ <- 0 until queriesCount) yield {
            val arr = readLineAsInts
            (arr(0), arr(1))
        }
        ranges.foreach{ case (a, b) => println(array.slice(a, b + 1).min) }
    }
}
