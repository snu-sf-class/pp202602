// Reference solution.
// To test it, replace Main.scala with this file and rename Midterm1Solution to Midterm1.

package pp202602.midterm1

import IList.*

object Midterm1Solution:
  /** Interleave two lists of the same element type. */
  def zigzip[A](l1: IList[A], l2: IList[A]): IList[A] =
    (l1, l2) match
      case (_, INil) => l1
      case (INil, _) => l2
      case (ICons(x, xs), ICons(y, ys)) => ICons(x, ICons(y, zigzip(xs, ys)))
