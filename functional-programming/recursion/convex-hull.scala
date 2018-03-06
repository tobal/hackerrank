object Solution {
    case class Point(x: Double, y: Double)

    def isCcw(ab: Point, cd: Point, ef: Point): Boolean = {
        val (a, b, c, d, e, f) = (ab.x, ab.y, cd.x, cd.y, ef.x, ef.y)
        (f - b) * (c - a) >= (d - b) * (e - a)
    }

    def ccwSorting(leftmost: Point)(p: Point, q: Point) = isCcw(leftmost, p, q)

    def sortPoints(points: List[Point]): List[Point] = {
        val leftmost = points.minBy(_.x)
        val sorting: (Point, Point) => Boolean = ccwSorting(leftmost)
        points.sortWith(sorting(_, _))
    }

    def filterCcw(points: List[Point]): List[Point] = {
        val full = points(points.size - 1) :: points ::: List(points(points.size - 2))
        val sliding = full.sliding(3, 1).zipWithIndex.toList
        val concave = sliding.find{ case (List(a, b, c), index) => !isCcw(a, b, c) }
        if(concave.isDefined) {
            val idx = sliding indexOf concave.get
            filterCcw( (points take idx) ++ (points drop (idx + 1)) )
        }
        else points
    }

    def convexHull(points: List[Point]) = filterCcw(sortPoints(points))

    def lengthOf(pointA: Point, pointB: Point): Double = {
        scala.math.sqrt(scala.math.pow(pointA.x - pointB.x, 2) + scala.math.pow(pointA.y - pointB.y, 2))
    }

    def foldPerimeter(acc: Double, prevPoint: Point, points: List[Point]): Double = points match {
        case Nil => acc
        case next :: rest => foldPerimeter(acc + lengthOf(prevPoint, next), next, rest)
    }

    def convexHullPerimeter(points: List[Point]): Double = {
        val hull = convexHull(points)
        foldPerimeter(0.0, hull.last, hull)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) yield Point(sc.nextInt(), sc.nextInt())
        println(convexHullPerimeter(points.toList))
    }
}
