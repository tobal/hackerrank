object Solution {
    
    def determine(princess: (Int, Int), me: (Int, Int)): String = {
        val horizontalDistance = princess._1 - me._1
        val verticalDistance = princess._2 - me._2
        if(horizontalDistance == 0) {
            if(verticalDistance < 0) "LEFT" else "RIGHT"
        }
        else if(verticalDistance == 0) {
            if(horizontalDistance < 0) "UP" else "DOWN"
        }
        else if(verticalDistance < 0) "LEFT" else "RIGHT"
    }
    
    def findPrincess(grid: Array[String]): (Int, Int) = {
        var princessLocation = (0, 0)
        for((line, lineIndex) <- grid.zipWithIndex) {
            if (line.indexOf('p') != -1) princessLocation = (lineIndex, line.indexOf('p'))
        }
        princessLocation
    }

    def nextMove(player:Int, r:Int, c:Int, grid:Array[String]) = {
        val princessLoc = findPrincess(grid)
        val myLoc = (r, c)
        println(determine(princessLoc, myLoc))
    }

    def main(args: Array[String]) = { 
        val n = Console.readInt
        var x_y = Console.readLine.split(" ")
        val r = x_y(0).toInt
        val c = x_y(1).toInt
        val grid = new Array[String](n)
        for (i <- 0 until n) {
            grid.update(i, Console.readLine)
        }
        nextMove(n,r,c,grid)
    }
}
