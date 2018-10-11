object Solution {

    def determine(debris: (Int, Int), bot: (Int, Int)): String = {
        val horizontalDistance = debris._1 - bot._1
        val verticalDistance = debris._2 - bot._2
        if(horizontalDistance == 0) {
            if(verticalDistance < 0) "LEFT" else "RIGHT"
        }
        else if(verticalDistance == 0) {
            if(horizontalDistance < 0) "UP" else "DOWN"
        }
        else if(verticalDistance < 0) "LEFT" else "RIGHT"
    }

    def nextMove(pos: String, board: Array[String]) = {
        val botLoc = findBot(board)
        if (botLoc.isEmpty) println("CLEAN")
        else {
            val nearest: (Int, Int) = findNearestDebris(botLoc.get, board)
            println(determine(nearest, botLoc.get))
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
        val dimensions = Console.readLine.split(" ").toList.map(_.toInt)
        val board = new Array[String](dimensions(1))
        for (i <- 0 until dimensions(0)) {
            board.update(i, Console.readLine)
        }
        nextMove(pos, board)
    }
}
