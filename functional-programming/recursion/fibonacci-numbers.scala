object Solution {
    def fibonacci(x: Int): Int = {
        def recurse(loopsToGo: Int, prev: Int, actual: Int): Int = {
            if (loopsToGo > 0) recurse(loopsToGo - 1, actual, prev + actual)
            else actual
        }
        recurse(x - 2, 0, 1)
    }

    def main(args: Array[String]) {
        println(fibonacci(readInt()))
    }
}
