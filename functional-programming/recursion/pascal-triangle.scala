object Solution {
    def nextRow(prevRow: List[Int]): List[Int] = prevRow match {
        case List(1) => List(1, 1)
        case List(1, 1) => List(1, 2, 1)
        case row: List[Int] => {
            val pairs = row zip row.tail
            val sums = pairs.map{ case (x, y) => x + y }
            List(1) ++ sums ++ List(1)
        }
    }
    
    def printRow(row: List[Int]) = println(row.mkString(" "))
    
    def pascal(levels: Int, row: List[Int]) {
        if (levels != 0) {
            printRow(row)
            pascal(levels - 1, nextRow(row))
        }
    }
    
    def main(args: Array[String]) {
        pascal(readInt(), List(1))
    }
}
