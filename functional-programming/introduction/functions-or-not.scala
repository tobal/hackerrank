object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val case_n = sc.nextInt()
        for(arr_i <- 0 to case_n - 1) {
            val size = sc.nextInt()
            var arr = new Array[(Int, Int)](size)
            for(arr_i <- 0 to size - 1) {
                arr(arr_i) = (sc.nextInt(), sc.nextInt())
            }
            if (arr.toList.toMap.size == arr.toList.size) println("YES")
            else println("NO")
        }
    }
}
