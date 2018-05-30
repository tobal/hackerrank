object Solution {
    def nextMove(pos: String, board: Array[String]) = ???

    def main(args: Array[String]) = { 
        val pos = Console.readLine
        val board = new Array[String](5)
        for (i <- 0 until 5) {
            board.update(i, Console.readLine)
        }
        nextMove(pos, board)
    }
}
