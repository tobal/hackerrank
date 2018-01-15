def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    val zipped = coefficients zip powers
    val polynom = for {
        z <- zipped
    } yield {
        z._1 * scala.math.pow(x, z._2)
    }
    polynom.sum
}

def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    scala.math.Pi * scala.math.pow(f(coefficients, powers, x), 2)
}

def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
    val curve = for {
        x <- lowerLimit.toDouble to upperLimit.toDouble by 0.001
    } yield {
        0.001 * func(coefficients, powers, x)
    }
    curve.sum
}
