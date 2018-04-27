object Solution {

    def divisibleSumPairs(k: Int, ar: List[Int]): Int = {
        val l = for(x <- ar; y <- ar) yield (x, y)
        (l.filter{case (x, y) => (x + y) % k == 0}.size) / 2 - 1
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        val n = sc.nextInt();
        val k = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        val result = divisibleSumPairs(n, k, ar)
        println(result)
    }
}
