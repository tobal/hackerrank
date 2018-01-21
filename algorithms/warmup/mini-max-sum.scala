object Solution {

    def miniMaxSum(arr: Array[Int]): Unit =  {
        val min = arr.toList.combinations(4).map(_.sum).reduceLeft(_ min _)
        val max = arr.toList.combinations(4).map(_.sum).reduceLeft(_ max _)
        print(min)
        print(" ")
        print(max)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        var arr = new Array[Int](5)
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt()
        }
        miniMaxSum(arr)
    }
}
