object Solution {

    def calcWeightedMean(values: List[Double], weights: List[Double]): Double = {
        val weightedValues = values.zip(weights).map{ case (a, b) => a * b }
        BigDecimal(weightedValues.sum / weights.sum).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    def main(args: Array[String]) {
        readInt
        val values = readLine.split(" ").toList.map(_.toDouble)
        val weights = readLine.split(" ").toList.map(_.toDouble)
        println(calcWeightedMean(values, weights))
    }
}
