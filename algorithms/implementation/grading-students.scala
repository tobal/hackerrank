import java.io.PrintWriter

object Solution {

    def gradingStudents(grades: Array[Int]): Array[Int] = {
        def roundGrade(grade: Int): Int = {
            print("grade ", grade)
            if (grade < 38) grade
            else {
                val rounded = grade + (5 - (grade % 5))
                print("round ", rounded)
                rounded - grade match {
                    case x if (x == 3) => grade
                    case _ => rounded
                }
            }
        }
        
        grades.map(roundGrade)
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn
        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))
        val n = scan.readLine.trim.toInt
        val grades = Array.ofDim[Int](n)

        for (gradesItr <- 0 until n) {
            val gradesItem = scan.readLine.trim.toInt
            grades(gradesItr) = gradesItem}

        val result = gradingStudents(grades)
        fw.println(result.mkString("\n"))
        fw.close()
    }
}
