#!/usr/bin/env scala

object Solution {
  val width = 63
  val height = 32
  //val width = 7
  //val height = 4

  def triangle(r: Int, c: Int, w: Int, rowOffset: Int, columnOffset: Int): Boolean = {
    c < (w / 2 + columnOffset) + r + 1 + rowOffset && c > (w / 2 + columnOffset) - r + 1 + rowOffset
  }

  def inTriangle(row: Int, column: Int): Boolean = {
    if (triangle(row, column, width, 0, 0)) {
        if (row > height / 2) {
          val columnOffset = width / 2
          val rowOffset = height / 2
          if (
              triangle(row, column, width / 2, -rowOffset, 0)
              ||
              triangle(row, column, width / 2, rowOffset + 1, columnOffset)
            ) true
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
