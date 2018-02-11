object Solution {

    def main(args: Array[String]) {
        print((readLine() zip readLine()).toList.map(_.productIterator.toList).flatten.mkString)
    }
}
