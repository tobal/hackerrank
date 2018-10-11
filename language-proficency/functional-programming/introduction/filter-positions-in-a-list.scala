def f(arr: List[Int]): List[Int] = for { (elem, i) <- arr.zipWithIndex if i % 2 == 1 } yield elem
