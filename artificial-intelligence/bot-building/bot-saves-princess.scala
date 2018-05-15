object Solution {

  def displayPathtoPrincess(m: Int, grid: Array[String]) = {

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
