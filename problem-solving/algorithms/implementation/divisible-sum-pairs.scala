object Solution {

    def divisibleSumPairs(k: Int, ar: List[Int]): Int =  {
        val pairs = for(x <- ar; y <- ar) yield (x, y)
        val filtered = pairs.filter{case (x, y) => (x + y) % k == 0}.filter{case (x, y) => (x != y)}
        (filtered.size) / 2
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val n = sc.nextInt()
        val k = sc.nextInt()
        val ar = new Array[Int](n)
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt()
        }
        val result = divisibleSumPairs(k, ar.toList)
        println(result)
    }
}
