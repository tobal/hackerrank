object Solution {
    val width = 100
    val height = 63
    
    def tree(row: Int, column: Int, n: Int): Boolean = {
        val offset = row - 48 //(height / 2 + (height / 4))
        
        if (column == width / 2 && row > 48/*height / 2 + (height / 4)*/) return true
        else if (row <= 48/*height / 2 + (height / 4)*/ && row > 31 &&
                 (column == width / 2 + offset || column == width / 2 - offset) ) return true
        else return false
    }
    
    def drawTree(n: Int) {
        for ( row <- 1 to height ) yield {
            for ( column <- 1 to width ) yield {
                if(tree(row, column, n)) print("1")
                else print("_")
            }
            println("")
        }
    }

    def main(args: Array[String]) {
        drawTree(readInt)
    }
}
