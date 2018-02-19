object Solution {
    def alternatives(sum: Int, powers: List[Int]): List[List[Int]] = {
        if (sum == 0) List(List())
        if (powers.isEmpty) List()
        
        val output = for (power <- powers) yield {
            val rest = powers.filter(_ != power)
            val next = sum - power
            
            if (next > 0) alternatives(sum, rest) ++ alternatives(next, powers.dropWhile(_ <= power)).map(power :: _)
            else if (next < 0) alternatives(sum, rest)
            else alternatives(sum, rest) :+ List(power)
        }
        output.flatMap(x => x)
    }

    def main(args: Array[String]): Unit = {
        val sum = readInt
        val exponent = readInt
        val powers = for {
            i <- 1 to math.pow(sum, 1.0 / exponent).toInt
        } yield { math.pow(i, exponent).toInt }

        println(alternatives(sum, powers.toList).toSet.size)
		}
}
