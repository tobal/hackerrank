object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        val n = sc.nextInt();
        var s = new Array[Int](n);
        for(s_i <- 0 to n-1) {
           s(s_i) = sc.nextInt();
        }
        val d = sc.nextInt();
        val m = sc.nextInt();

        println(s.toList.sliding(m,1).toList.map(_.sum).filter(_ == d).size)
    }
}
