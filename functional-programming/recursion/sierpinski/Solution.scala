#!/usr/bin/env scala

object Solution {
  val width = 63
  val height = 32
  //val width = 7
  //val height = 4

  def inTriangle(row: Int, column: Int): Boolean = {
    if(column < width / 2 + row + 1 &&
      column > width / 2 - row + 1) {
        if (row > height / 2) {
          if (column < width / 4 + row + 1 - height / 2 &&
              column > width / 4 - row + 1 - height / 2
              ||
              column < (width / 4 + width / 2) + row + 2 + height / 2 &&
              column > (width / 4 + width / 2) - row + 2 + height / 2) true
          else false
        }
        else true
      }
    else false
  }

  def drawTriangles(n: Int) {
    for ( row <- 1 to height ) yield {
      for ( column <- 1 to width ) yield {
        if(inTriangle(row, column)) print("1")
        else print("_")
      }
      println("")
    }
  }

  def main(args: Array[String]) {
    //drawTriangles(readInt())
    drawTriangles(1)
  }
}
