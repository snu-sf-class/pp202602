// Reference solution.
// To test it, replace Main.scala with this file and rename Midterm3Solution to Midterm3.

package pp202602.midterm3

object Midterm3Solution:
  val stream: IStream[Int] =
    def from(first: Int, second: Int): IStream[Int] =
      new IStream[Int]:
        val head: Int = first
        lazy val tail: IStream[Int] = from(second, first + second)

    from(0, 1)
