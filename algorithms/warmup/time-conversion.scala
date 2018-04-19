import java.io.PrintWriter

object Solution {

    def timeConversion(s: String): String = {
        val timePattern = "([0-2][0-9]):([0-5][0-9]):([0-5][0-9])"
        val AM = s"${timePattern}AM".r
        val PM = s"${timePattern}PM".r
        s match {
            case AM(hours, minutes, seconds) => s"$hours:$minutes:$seconds"
            case PM(hours, minutes, seconds) => {
                val adjustedHours = if (hours.toInt > 11) scala.math.abs(hours.toInt - 12)
                                    else hours.toInt + 12
                s"$adjustedHours:$minutes:$seconds"
            }
            case x => x
        }
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn
        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))
        val s = scan.readLine
        val result = timeConversion(s)
        fw.println(result)
        fw.close()
    }
}
