object Solution {
    def readLineAsInts(): List[Int] = readLine.split(" ").toList.map(_.toInt)

    def main(args: Array[String]) {
        val csojj1 = readInt
        val first = readLineAsInts
        val csojj2 = readInt
        val second = readLineAsInts
        println((second diff first).sorted.mkString(" "))
    }
}
