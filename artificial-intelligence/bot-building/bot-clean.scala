object Solution {

    def nextMove(pos: String, board: Array[String]) = {
        val botLoc = findBot(board)
        if (botLoc.isEmpty) println("CLEAN")
    }

    def findBot(board: Array[String]): Option[(Int, Int)] = {
        var location: Option[(Int, Int)] = None
        for((line, lineIndex) <- board.zipWithIndex) {
            if (line.indexOf('b') != -1) location = Some(lineIndex, line.indexOf('b'))
        }
        location
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
