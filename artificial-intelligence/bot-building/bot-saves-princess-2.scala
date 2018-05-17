object Solution {

    def nextMove(player:Int, r:Int, c:Int, grid:Array[String]) = ???

    def main(args: Array[String]) = { 
        val n = Console.readInt
        var x_y = Console.readLine.split(" ")
        val r = x_y(0).toInt
        val c = x_y(1).toInt
        val grid = new Array[String](n)
        for (i <- 0 until n) {
            grid.update(i, Console.readLine)
        }
        nextMove(n, r, c, grid)
    }
}
