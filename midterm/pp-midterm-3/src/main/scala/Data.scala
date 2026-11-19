/// !!! DO NOT MODIFY THIS FILE !!!

package pp202602.midterm3

/** A lazy, immutable stream. */
abstract class IStream[+A]:
  def head: A
  def tail: IStream[A]

  final def apply(index: Int): A =
    if index < 0 then throw new IllegalArgumentException("negative stream index")
    else
      @scala.annotation.tailrec
      def loop(current: IStream[A], remaining: Int): A =
        if remaining == 0 then current.head
        else loop(current.tail, remaining - 1)

      loop(this, index)
