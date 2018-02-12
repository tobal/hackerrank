#!/usr/bin/env scala

object Solution {
    def main(args: Array[String]) {
        val cases = readInt()
        for (i <- 0 to cases) {
            println(readLine().grouped(2).toList.flatMap(_.reverse).mkString)
        }
    }
}
