def f(num:Int, arr:List[Int]): List[Int] = {
    val l = for { element <- arr } yield { List.fill(num)(element) }
    l.flatten
}
