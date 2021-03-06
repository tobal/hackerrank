#!/usr/bin/env scala

object Solution {
    def asChar(num: Int): List[Char] = num.toString.toList
    
    def compress(s: String): String = {
        def rec(input: List[Char], acc: List[Char], prev: Char, occurrances: Int): List[Char] = input match {
            case x :: xs => {
                if (x == prev) rec(xs, acc, x, occurrances + 1)
                else if (occurrances > 1) rec(xs, x :: asChar(occurrances).reverse ::: acc, x, 1)
                else rec(xs, x :: acc, x, 1)
            }
            case Nil => {
                if (occurrances > 1) asChar(occurrances).reverse ::: acc
                else acc
            }
        }
        val strAsList: List[Char] = s.toList
        rec(strAsList.tail, List(strAsList.head), strAsList.head, 1).mkString.reverse
    }

    def main(args: Array[String]) {
        print(compress(readLine))
    }
}
