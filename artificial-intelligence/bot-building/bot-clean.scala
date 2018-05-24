object Solution {
    
    def nextMove(pos:String, board:Array[String]) = ???

    def findBot(board: Array[String]): (Int, Int) = {
        var location = (0, 0)
        for((line, lineIndex) <- grid.zipWithIndex) {
            if (line.indexOf('b') != -1) location = (lineIndex, line.indexOf('b'))
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
