def f(delim: Int, arr: List[Int]): List[Int] = for { elem <- arr if elem < delim } yield elem
