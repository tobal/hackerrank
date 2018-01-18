object Solution {

    def diagonalDifference(a: Array[Array[Int]], size: Int): Int =  {
        val diag = for (i <- 0 until size) yield a(i)(i)
        val diag2 = for (i <- 0 until size) yield a(i)(a(0).size - i - 1)
        (diag.sum - diag2.sum).abs
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        val result = diagonalDifference(a, n);
        println(result)
    }
}
