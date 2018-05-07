import java.io.PrintWriter
import scala.collection.mutable.Map

object Solution {
    val counter = Map[Int, Int]().withDefaultValue(0)

    def migratoryBirds(ar: List[Int]): Int = {
        for (b <- ar) {
            counter(b) = counter(b) + 1
        }
        val max = counter.maxBy(_._2)._2
        val vals = for (c <- counter if c._2 == max) yield c
        vals.minBy(_._1)._1
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
        val arCount = stdin.readLine.trim.toInt
        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        
        val result = migratoryBirds(ar.toList)
        
        printWriter.println(result)
        printWriter.close()
    }
}
