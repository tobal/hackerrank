object Solution {
    val const = 1000000007
    
    def gcd(x: BigInt, y: BigInt): BigInt = if (x == 0) y else gcd(y % x, x)
    
    def readLineAsInts(): Array[BigInt] = readLine.split(" ").map(BigInt(_))

    def main(args: Array[String]) {
        val csojj1 = readInt
        val first = readLineAsInts
        val csojj2 = readInt
        val second = readLineAsInts
        val A = first.product
        val B = second.product
        println(gcd(A, B) % const)
    }
}
