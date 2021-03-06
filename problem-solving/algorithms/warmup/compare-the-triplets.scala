object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val aliceTriplet = List(sc.nextInt(), sc.nextInt(), sc.nextInt())
        val bobTriplet = List(sc.nextInt(), sc.nextInt(), sc.nextInt())
        val zipped = aliceTriplet zip bobTriplet
        val csojj = for { pair <- zipped } yield {
            if (pair._1 > pair._2) 1
            else if (pair._1 < pair._2) 2
            else 0
        }
        val alicePoints = csojj.groupBy(identity).mapValues(_.size).lift(1).getOrElse(0)
        val bobPoints = csojj.groupBy(identity).mapValues(_.size).lift(2).getOrElse(0)
        print(s"$alicePoints $bobPoints")
    }
}
