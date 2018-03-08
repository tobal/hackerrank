object Solution {
    import scala.collection.mutable.ListBuffer

    val buff: ListBuffer[List[Tuple2[Int, Int]]] = ListBuffer()

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            buff += readLine.split(" ").toList.sliding(2, 2).map{ case List(a, b) => (a.toInt, b.toInt) }.toList
        }
        var merged: Seq[(Int,List[(Int, Int)])] = Seq()
        for (l <- buff.toList) {
            merged = merged.toSeq ++ l.groupBy(_._1).toSeq
        }
        val counted = merged.groupBy(_._1).mapValues(_.map(_._2).toList).toSeq
        val relevant = counted.filter(_._2.size == cases)
        val results = for ((_, x) <- relevant) yield x.map{ case List(x) => x }.minBy(_._2)
        println(results.sortBy(_._1).flatMap{ x => x.productIterator.toList }.mkString(" "))
    }
}
