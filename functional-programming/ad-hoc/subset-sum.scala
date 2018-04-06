object Solution {
    def readLineAsInts(): List[Int] = readLine.split(" ").map(_.toInt).toList

    def subsetSum(arr: Set[Int], n: Int): Int = {
        val sizes = for (subset <- arr.subsets if subset.sum >= n) yield subset.size
        if (sizes.isEmpty) -1
        else sizes.min
    }
    
    def main(args: Array[String]) {
        readInt
        val set = readLineAsInts.toSet
        val cases = readInt
        for (i <- 0 until cases) {
            println(subsetSum(set, readInt))
        }
    }
}
