object Solution {
    def fact(num: Int): Int = (1 to num).foldLeft(1) ((a,b) => (a * b))
    
    def eOnX(num: BigDecimal): BigDecimal = {
        def f(acc: BigDecimal, i: Int): BigDecimal = {
            if (i == 0) acc + 1.0
            else if (i == 1) f(acc + num, i - 1)
            else f(acc + (scala.math.pow(num.doubleValue, i))/(BigDecimal.valueOf(fact(i))), i - 1)
        }
        f(0.0, 9)
    }

    def main(args: Array[String]) {
        for (ln <- io.Source.stdin.getLines if ln.contains('.')) {
            println(eOnX(BigDecimal(ln)))
        }
    }
}
