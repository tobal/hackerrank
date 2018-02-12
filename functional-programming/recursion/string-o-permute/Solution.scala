#!/usr/bin/env scala

object Solution {
    def perm(s: String): String = {
        s.sliding(2, 2)
          .toList
          .flatMap(_.reverse)
          .mkString("")
    }

    def main(args: Array[String]) {
        val cases = readInt()
        for (i <- 0 to cases) {
            val s = readLine()
            println(perm(s))
        }
    }
}
