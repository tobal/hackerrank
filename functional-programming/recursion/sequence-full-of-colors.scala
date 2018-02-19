object Solution {
    def colorNum(colors: String, color: Char): Int = colors.filter(_ == color).size
    
    def colorDiff(colors: String, color1: Char, color2: Char): Int = {
        math.abs(colorNum(colors, color1) - colorNum(colors, color2))
    }
    
    def checkPrefixes(colors: String): Boolean = {
        if (colors.init.isEmpty) true
        else if (colorDiff(colors, 'R', 'G') > 1 || colorDiff(colors, 'Y', 'B') > 1) false
        else checkPrefixes(colors.init)
    }
    
    def isFullOfColors(colors: String): Boolean = {
        if (colorNum(colors, 'R') != colorNum(colors, 'G')) false
        if (colorNum(colors, 'Y') != colorNum(colors, 'B')) false
        checkPrefixes(colors.init)
    }

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            if (isFullOfColors(readLine)) println("True")
            else println("False")
        }
    }
}
