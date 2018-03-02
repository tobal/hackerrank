object Solution {
    case class Point(x: Double, y: Double)

    def angle(p0: Point, p1: Point, p2: Point): Double = {
        val a = math.pow(p1.x - p0.x, 2) + math.pow(p1.y - p0.y, 2)
        val b = math.pow(p1.x - p2.x, 2) + math.pow(p1.y - p2.y, 2)
        val c = math.pow(p2.x - p0.x, 2) + math.pow(p2.y - p0.y, 2)
        math.acos( (a + b - c) / math.sqrt(4 * a * b) )
    }

    def angleToCenter(point: Point, center: Point): Double = {
        math.atan2( point.y - center.y, point.x - center.x )
    }

    def sortPoints(points: List[Point]): List[Point] = {
        val boundUX = points.maxBy(_.x).x
        val boundLX = points.minBy(_.x).x
        val boundUY = points.maxBy(_.y).y
        val boundLY = points.minBy(_.y).y
        val center = Point( boundLX + ((boundUX - boundLX) / 2), boundLY + ((boundUY - boundLY) / 2) )
        points.sortWith( angleToCenter(_, center) > angleToCenter(_, center) )
    }

    def isConcave(points: List[Point]): Boolean = {
        val sorted = sortPoints(points)
        val full = sorted(sorted.size - 2) :: sorted(sorted.size - 1) :: sorted
        val angles = full.reverse.sliding(3, 1).map{ case l => angle(l(0), l(1), l(2)).toDegrees }.toList
        angles.filter(_ > 180.0).size > 0
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) yield Point(sc.nextInt(), sc.nextInt())
        println( if (isConcave(points.toList)) "YES" else "NO" )
    }
}
