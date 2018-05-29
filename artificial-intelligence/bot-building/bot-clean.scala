object Solution {

    def nextMove(pos: String, board: Array[String]) = {
        val botLoc = findBot(board)
        if (botLoc.isEmpty) println("CLEAN")
        else {
            val nearest: (Int, Int) = findNearestDebris(botLoc, board)
        }
    }

    def findBot(board: Array[String]): Option[(Int, Int)] = {
        var location: Option[(Int, Int)] = None
        for((line, lineIndex) <- board.zipWithIndex) {
            if (line.indexOf('b') != -1) location = Some(lineIndex, line.indexOf('b'))
        }
        location
    }

    def findNearestDebris(bot: (Int, Int), board: Array[String]): (Int, Int) =
        findDebris(board).minBy(distance(bot, _))

    def distance(a: (Int, Int), b: (Int, Int)): Int =
        scala.math.abs(a._1 - b._1) + scala.math.abs(a._2 - b._2)

    def findDebris(board: Array[String]): List[(Int, Int)] = {
        for {
            (line, lineIndex) <- board.toList.zipWithIndex
            (char, rowIndex) <- line.zipWithIndex if char == 'd'
        } yield (lineIndex, rowIndex)
    }

    def main(args: Array[String]) = {
        val pos = Console.readLine
        val board = new Array[String](5)
        for (i <- 0 until 5) {
            board.update(i, Console.readLine)
        }
        nextMove(pos, board)
    }
}
