object Solution {

    def isOnHouse(s: Int, t: Int, start: Int, value: Int): Boolean = {
        val v = start + value
        ((v >= s) && (v <= t))
    }

    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
        val applesOnHouse = for (ap <- apples if isOnHouse(s, t, a, ap)) yield ap
        println(applesOnHouse.size)
        val orangesOnHouse = for (or <- oranges if isOnHouse(s, t, b, or)) yield or
        println(orangesOnHouse.size)
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val st = scan.readLine.split(" ")
        val s = st(0).trim.toInt
        val t = st(1).trim.toInt
        val ab = scan.readLine.split(" ")
        val a = ab(0).trim.toInt
        val b = ab(1).trim.toInt
        val mn = scan.readLine.split(" ")
        val m = mn(0).trim.toInt
        val n = mn(1).trim.toInt

        val apple = scan.readLine.split(" ").map(_.trim.toInt)
        val orange = scan.readLine.split(" ").map(_.trim.toInt)

        countApplesAndOranges(s, t, a, b, apple, orange)
    }
}
