import java.io.PrintWriter

object Solution {


    def breakingRecords(score: Array[Int]): Array[Int] = {
        def maxMin(max: Int, min: Int, maxCount: Int, minCount: Int, score: List[Int]): Array[Int] = score match {
            case x :: xs if (max < x) => maxMin(x, min, maxCount + 1, minCount, xs)
            case x :: xs if (min > x) => maxMin(max, x, maxCount, minCount + 1, xs)
            case x :: xs => maxMin(max, min, maxCount, minCount, xs)
            case List(x) => if (x > max) Array(maxCount + 1, minCount)
                            else if (x < min) Array(maxCount, minCount + 1)
                            else Array(maxCount, minCount) 
            case Nil => Array(maxCount, minCount)
        }
        maxMin(score.toList.head, score.toList.head, 0, 0, score.toList.tail)
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = scan.readLine.trim.toInt

        val score = scan.readLine.split(" ").map(_.trim.toInt)
        val result = breakingRecords(score)

        fw.println(result.mkString(" "))

        fw.close()
    }
}
