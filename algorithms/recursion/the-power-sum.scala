object Solution {
    def alternatives(sum: Int, exponent: Int, curr: Int): Int = {
        val subtracted = sum - math.pow(curr, exponent).toInt
        if (subtracted < 0) 0
        else if (subtracted == 0) 1
        else alternatives(subtracted, exponent, curr + 1) + alternatives(sum, exponent, curr + 1)
    }

    def main(args: Array[String]): Unit = {
        val sum = readInt
        val exponent = readInt

        println(alternatives(sum, exponent, 1))
  }
}
