object Solution {
    def rotations(str: List[Char]): String = {
        def recur(str: List[Char], acc: List[String]): List[String] = {
            if (str.size <= acc.size) acc
            else {
                val cat = str.tail ++ List(str.head)
                recur(cat, cat.mkString :: acc)
            }
        }
        
        recur(str, Nil).reverse.mkString(" ")
    }

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            println(rotations(readLine().toList))
        }

    }
}
