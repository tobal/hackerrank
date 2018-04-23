object Solution {
    
    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = {
        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) return false
        else {
            for (i <- 0 until 10000) {
                if (x1 + i * v1 == x2 + i * v2) return true
            }
            return false
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val (x1, v1, x2, v2) = (sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())
        if (kangaroo(x1, v1, x2, v2)) println("YES")
        else println("NO")
    }
}
