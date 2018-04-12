import java.io.PrintWriter

object Solution {


    def breakingRecords(score: Array[Int]): Array[Int] = ???

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
