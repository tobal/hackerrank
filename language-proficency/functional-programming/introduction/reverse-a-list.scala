def f(arr: List[Int]): List[Int] = {
    def f2(arr: List[Int], acc: List[Int]): List[Int] = arr.lastOption match {
        case Some(elem) => f2(arr.take(arr.length - 1), acc ::: List(elem))
        case None => acc
    }
    
    f2(arr, List())
}
