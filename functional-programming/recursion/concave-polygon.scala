object Solution {
    case class Point(x: Int, y: Int)
    
    def angle(p0: Point, p1: Point, p2: Point): Double = {
        val a = math.pow(p1.x - p0.x, 2) + math.pow(p1.y - p0.y, 2)
        val b = math.pow(p1.x - p2.x, 2) + math.pow(p1.y - p2.y, 2)
        val c = math.pow(p2.x - p0.x, 2) + math.pow(p2.y - p0.y, 2)
        math.acos( (a + b - c) / math.sqrt(4 * a * b) )
    }
    
    def isConcave(points: List[Point]): Boolean = {
        val angles = points.sliding(3, 1).map{ case l => angle(l(0), l(1), l(2)) }.toList
        angles.filter(_ > 180.0).size > 0
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        val points = for (i <- 0 until cases) yield Point(sc.nextInt(), sc.nextInt())
        println( if (isConcave(points.toList)) "YES" else "NO" )
    }
}
