object Solution {
    def filterByCount(input: List[Int], repetition: Int) = {
        val r = input.map(x => (x, input.count(_ == x))).distinct.filter{ case (x, c) => c >= repetition }
        if (r.isEmpty) println(-1)
        else println(r.unzip._1.mkString(" "))
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val cases = sc.nextInt()
        for (i <- 0 until cases) {
            val (size, repetition) = (sc.nextInt(), sc.nextInt())
            var input = new Array[Int](size)
            for (i <- 0 until size) {
                input(i) = sc.nextInt()
            }
            filterByCount(input.toList, repetition)
        }
    }
}
