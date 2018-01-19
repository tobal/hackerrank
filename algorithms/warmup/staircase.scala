object Solution {

    def staircase(n: Int)  =  {
        for { i <- 1 to n } {
            for { j <- 1 to n } {
                if(i + j >= n + 1) print('#')
                else print(' ')
            }
            println()
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        var n = sc.nextInt()
        staircase(n)
    }
}
