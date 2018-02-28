object Solution {
    def digitSum(num: Int): Int = num.toString.toList.map(_.asDigit).sum
    
    def superDigit(num: Int): Int = num match {
        case n if n > 9 => superDigit(digitSum(n))
        case n => n
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val toRepeat = sc.nextInt()
        val multip = sc.nextInt()
        val in = superDigit(toRepeat) * multip
        println(superDigit(in))
    }
}
