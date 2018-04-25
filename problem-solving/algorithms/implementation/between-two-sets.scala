import java.io.PrintWriter

object Solution {

    def getTotalX(a: Array[Int], b: Array[Int]): Int = {
        val max = math.max(a.toList.max, b.toList.max)
        val bools = for(i <- 1 to max) yield
            (a.toList.filter(i % _ == 0).size == a.size) && (b.toList.filter(_ % i == 0).size == b.size)
        bools.toList.filter(_ == true).size
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn
        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))
        val nm = scan.readLine.split(" ")
        val n = nm(0).trim.toInt
        val m = nm(1).trim.toInt
        val a = scan.readLine.split(" ").map(_.trim.toInt)
        val b = scan.readLine.split(" ").map(_.trim.toInt)
        val total = getTotalX(a, b)
        fw.println(total)
        fw.close()
    }
}
