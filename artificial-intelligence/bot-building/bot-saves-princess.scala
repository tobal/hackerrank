object Solution {

    def displayPathtoPrincess(m: Int, grid: Array[String]) = {
        val (princess, me) = findCharacters(m, grid)
        val horizontalDistance = princess._1 - me._1
        val verticalDistance = princess._2 - me._2
        val horizontalMove = if(horizontalDistance < 0) "UP" else "DOWN"
        val verticalMove = if(verticalDistance < 0) "LEFT" else "RIGHT"
        for (i <- 0 until scala.math.abs(horizontalDistance)) println(horizontalMove)
        for (i <- 0 until scala.math.abs(verticalDistance)) println(verticalMove)
    }

    def findCharacters(m: Int, grid: Array[String]): ((Int, Int), (Int, Int)) = {
        var princessLocation = (0, 0)
        var myLocation = (0, 0)
        for((line, lineIndex) <- grid.zipWithIndex) {
            if (line.indexOf('p') != -1) princessLocation = (lineIndex, line.indexOf('p'))
            if (line.indexOf('m') != -1) myLocation = (lineIndex, line.indexOf('m'))
        }
        (princessLocation, myLocation)
    }

    def main(args: Array[String]) = {
        val m = Console.readLine.toInt
        val grid = new Array[String](m)

        for (i <- 0 until m) {
            grid.update(i, Console.readLine)
        }

        displayPathtoPrincess(m, grid)
    }
}
