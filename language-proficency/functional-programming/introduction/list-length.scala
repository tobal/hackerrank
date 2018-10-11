def f(arr: List[Int]): Int = {
    var count = 0
    for (i <- arr) yield count += 1
    count
}
