object Solution {
    def areaOf(pointA: (Int, Int), pointB: (Int, Int)): Double = {
        (pointA._1 + pointB._1) * (pointA._2 - pointB._2)
    }

    def foldPerimeter(acc: Double, prevPoint: (Int, Int), points: List[(Int, Int)]): Double = points match {
        case Nil => acc
        case next :: rest => foldPerimeter(acc + areaOf(prevPoint, next), next, rest)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val case_n = sc.nextInt()
        var arr = new Array[(Int, Int)](case_n)
        for(arr_i <- 0 to case_n - 1) {
            arr(arr_i) = (sc.nextInt(), sc.nextInt())
        }
        val areaDub: Double = foldPerimeter(0.0, arr.last, arr.toList)
        println(scala.math.abs(areaDub / 2.0))
    }
}
