object Solution {
    def digitSum(num: BigInt): BigInt = num.toString.toList.map(_.asDigit).sum

    def superDigit(num: BigInt): BigInt = num match {
        case n if n > 9 => superDigit(digitSum(n))
        case n => n
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val toRepeat = BigInt(sc.nextBigInteger())
        val multip = BigInt(sc.nextBigInteger())
        val in = superDigit(toRepeat) * multip
        println(superDigit(in))
    }
}
