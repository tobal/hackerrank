object Solution {
    case class Point(x: Double, y: Double)

    def isCcw(ab: Point, cd: Point, ef: Point): Boolean = {
        val (a, b, c, d, e, f) = (ab.x, ab.y, cd.x, cd.y, ef.x, ef.y)
        (f - b) * (c - a) > (d - b) * (e - a)
    }
    
    def ccwSorting(leftmost: Point)(p: Point, q: Point) = isCcw(leftmost, p, q)
    
    def sortPoints(points: List[Point]): List[Point] = {
        val leftmost = points.minBy(_.x)
        val sorting: (Point, Point) => Boolean = ccwSorting(leftmost)
        points.sortWith( sorting(_, _) )
        points
    }

    def convexHull(points: List[Point]) = {
        val sorted = sortPoints(points)
        //val maxX = points.maxBy(_.x)
        //val minX = points.minBy(_.x)
        //val full = sorted(sorted.size - 2) :: sorted(sorted.size - 1) :: sorted
        //val angles = full.sliding(3, 1).map{ case l => angle(l(0), l(1), l(2)).toDegrees }.toList
        //angles.filter(_ > 180.0).size > 0
        sorted
    }
    
    def perimeter(points: List[Point]): Double = {
        1.0
    }
    
    def convexHullPerimeter(points: List[Point]) = {
        val hull = convexHull(points)
        perimeter(hull)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) yield Point(sc.nextInt(), sc.nextInt())
        println(convexHullPerimeter(points.toList))
    }
}
