#!/usr/bin/env scala

object Solution {
  val width = 63
  val height = 32

  def inTriangle(row: Int, column: Int): Boolean = {
    if(column < width / 2 + row + 1 &&
      column > width / 2 - row + 1) true
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
