object Solution {
    def lengthOf(pointA: (Int, Int), pointB: (Int, Int)): Double = {
        scala.math.sqrt(scala.math.pow(pointA._1 - pointB._1, 2) + scala.math.pow(pointA._2 - pointB._2, 2))
    }
    
    def foldPerimeter(acc: Double, prevPoint: (Int, Int), points: List[(Int, Int)]): Double = points match {
        case Nil => acc
        case next :: rest => foldPerimeter(acc + lengthOf(prevPoint, next), next, rest)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val case_n = sc.nextInt()
        var arr = new Array[(Int, Int)](case_n)
        for(arr_i <- 0 to case_n - 1) {
            arr(arr_i) = (sc.nextInt(), sc.nextInt())
        }
        println(foldPerimeter(0.0, arr.last, arr.toList))
    }
}
