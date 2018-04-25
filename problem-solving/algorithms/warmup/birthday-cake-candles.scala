object Solution {

    def countMax(count: Int, max: Int, ar: List[Int]): Int = ar match {
        case Nil => count
        case next :: rest => {
            if (next > max) countMax(1, next, rest)
            else if (next == max) countMax(count + 1, max, rest)
            else countMax(count, max, rest)
        }
    }

    def birthdayCakeCandles(n: Int, ar: Array[Int]): Int = {
        countMax(0, 0, ar.toList)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        var n = sc.nextInt()
        var ar = new Array[Int](n)
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt()
        }
        val result = birthdayCakeCandles(n, ar)
        println(result)
    }
}
