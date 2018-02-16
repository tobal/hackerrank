object Solution {
    def process(acc: List[Char], in: List[Char], seen: Set[Char]): List[Char] = in match {
        case x :: xs => {
            if (seen contains x) process(acc, xs, seen)
            else process(x :: acc, xs, seen + x)
        }
        case Nil => acc.reverse
    }
    
    def main(args: Array[String]) {
        println(process(Nil, readLine.toList, Set()).mkString)
    }
}
