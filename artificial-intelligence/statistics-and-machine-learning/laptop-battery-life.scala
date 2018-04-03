object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        val timeCharged = sc.nextDouble();
        val result = if(timeCharged > 4) 8.0 else timeCharged * 2
        println(result)
    }
}
