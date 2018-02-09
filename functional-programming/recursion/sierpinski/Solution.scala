#!/usr/bin/env scala

object Solution {
  val width = 63
  val height = 32
  //val width = 7
  //val height = 4

  def triangle(r: Int, c: Int, w: Int, rowOffset: Int, columnOffset: Int): Boolean = {
    c < (w / 2 + columnOffset) + r + 1 - rowOffset && c > (w / 2 + columnOffset) - r + 1 + rowOffset
  }

  def inTriangle(row: Int, column: Int, iterations: Int): Boolean = {
    def recSier(width: Int, height: Int, rowOffset: Int, columnOffset: Int): Boolean = {
      if (row > height / 2) {
        (triangle(row, column, width / 2, rowOffset + height / 2, 0) ||
         triangle(row, column, width / 2, rowOffset + height / 2, columnOffset + 1 + width / 2))
      }
      else triangle(row, column, width, rowOffset, columnOffset)
    }
    recSier(width, height, 0, 0)
  }

  def drawTriangles(n: Int) {
    for ( row <- 1 to height ) yield {
      for ( column <- 1 to width ) yield {
        if(inTriangle(row, column, 1)) print("1")
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
