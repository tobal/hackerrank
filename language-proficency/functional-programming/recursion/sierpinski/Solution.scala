#!/usr/bin/env scala

object Solution {
  //val width = 63
  //val height = 32
  val width = 7
  val height = 4

  def oneTri(r: Int, c: Int, w: Int, rowOffset: Int, columnOffset: Int): Boolean = {
    c < (w / 2 + columnOffset) + r + 1 - rowOffset && c > (w / 2 + columnOffset) - r + 1 + rowOffset
  }

  def threeTri(row: Int, column: Int, width: Int, height: Int, rowOffset: Int, columnOffset: Int): Boolean = {
    if (row + rowOffset > height / 2) {
      (oneTri(row, column, width / 2, rowOffset + height / 2, columnOffset) ||
       oneTri(row, column, width / 2, rowOffset + height / 2, columnOffset + 1 + width / 2))
    }
    else oneTri(row, column, width, rowOffset, columnOffset)
  }

  def inTriangle(row: Int, column: Int, iterations: Int): Boolean = {
    def recSier(width: Int, height: Int, rowOffset: Int, columnOffset: Int, iteration: Int): Boolean = {
      if (iteration != 0) {
        recSier(width / 2, height / 2, rowOffset, columnOffset, iteration - 1)
      }
      else oneTri(row, column, width, rowOffset, columnOffset)
    }
    recSier(width, height, 0, 0, iterations)
  }

  def trian(row: Int, column: Int, width: Int, height: Int, iterations: Int): Boolean = {
    //println(row, column, width, height, iterations)
    if (iterations != 0) {
      if (row > height / 2) trian(row - height / 2, column, width, height / 2, iterations - 1)
      if (column > width / 2) trian(row, column - width / 2, width / 2, height, iterations - 1)
    }
    (column < width / 2 + row + 1 && column > width / 2 - row + 1)
  }

  def drawTriangles(n: Int) {
    for ( row <- 1 to height ) yield {
      for ( column <- 1 to width ) yield {
        //if(inTriangle(row, column, n)) print("1")
        if(trian(row, column, width, height, n)) print("1")
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
