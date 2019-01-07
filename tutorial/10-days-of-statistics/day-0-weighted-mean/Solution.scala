object Solution {

    def calcWeightedMean(values: List[Double], weights: List[Double]): Double = {
        val weightedValues = values.zip(weights).map{ case (a, b) => a * b }
        weightedValues.sum / weights.sum
    }

    def main(args: Array[String]) {
        val i = readInt
        val values = readLine.split(" ").toList.map(_.toDouble)
        val weights = readLine.split(" ").toList.map(_.toDouble)
        println(calcWeightedMean(values, weights))
    }
}
