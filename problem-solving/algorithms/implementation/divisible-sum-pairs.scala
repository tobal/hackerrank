object Solution {

    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = ???

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
