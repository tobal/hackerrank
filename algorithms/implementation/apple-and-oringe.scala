object Solution {

    /*
     * Complete the countApplesAndOranges function below.
     */
    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
        /*
         * Write your code here.
         */

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
