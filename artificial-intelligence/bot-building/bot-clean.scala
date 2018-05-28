object Solution {

    def nextMove(pos: String, board: Array[String]) = {
        val botLoc = findBot(board)
        if (botLoc.isEmpty) println("CLEAN")
    }

    def findBot(board: Array[String]): Option[(Int, Int)] = {
        var location = None
        for((line, lineIndex) <- grid.zipWithIndex) {
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
