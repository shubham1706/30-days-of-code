package practice.fibonacci

import scala.io.StdIn.readInt

/**
 * takes input from the use for N
 * and prints the Nth fibonacci number
 */
object NthFibonacci {

  var fibResults: Map[Int, Long] = Map[Int, Long]()

  def main(args: Array[String]): Unit = {
    print("Enter N : ")
    val n = readInt()
    print(s"${n}th Fibonacci number is : ${nThFibonacci(n)}")
  }

  private def nThFibonacci(n: Int) : Long = {
    if (n<2)
      n
    else {
      if (!fibResults.contains(n))
        fibResults = fibResults.+((n, (nThFibonacci(n - 2) + nThFibonacci(n - 1))))
      fibResults(n)
    }
  }
}
