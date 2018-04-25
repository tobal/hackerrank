object Solution {

    def plusMinus(arr: Array[Int]): Unit =  {
        println(arr.filter(_ > 0).size.toFloat / arr.size)
        println(arr.filter(_ < 0).size.toFloat / arr.size)
        println(arr.filter(_ == 0).size.toFloat / arr.size)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        plusMinus(arr);
    }
}
