object Solution {
    case class ColorCounts(red: Int = 0, green: Int = 0, blue: Int = 0, yellow: Int = 0)

    def countColor(ch: Char, counts: ColorCounts): ColorCounts = ch match {
        case 'R' => counts.copy(red = counts.red + 1)
        case 'G' => counts.copy(green = counts.green + 1)
        case 'B' => counts.copy(blue = counts.blue + 1)
        case 'Y' => counts.copy(yellow = counts.yellow + 1)
    }

    def isValidPrefix(c: ColorCounts): Boolean = (math.abs(c.red - c.green) <= 1 && math.abs(c.blue - c.yellow) <= 1)

    def checkPrefixes(colors: List[Char], colorCounts: ColorCounts): (Boolean, ColorCounts) = colors match {
        case x :: rest => {
            val counts = countColor(x, colorCounts)
            if (isValidPrefix(counts)) checkPrefixes(rest, counts)
            else (false, counts)
        }
        case Nil => (true, colorCounts)
    }

    def isFullOfColors(colors: List[Char]): Boolean = {
        val (prefixesOk, counts) = checkPrefixes(colors, ColorCounts())
        (counts.red == counts.green && counts.blue == counts.yellow && prefixesOk)
    }

    def main(args: Array[String]) {
        val cases = readInt
        for (i <- 0 until cases) {
            if (isFullOfColors(readLine.toList)) println("True")
            else println("False")
        }
    }
}
