object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val arraySize = sc.nextInt()
        val queriesCount = sc.nextInt()
        val array = for (_ <- 0 until arraySize) yield sc.nextInt()
        val ranges = for (_ <- 0 until queriesCount) yield (sc.nextInt(), sc.nextInt())
        ranges.foreach{ case (a, b) => println(array.slice(a, b + 1).min) }
    }
}
