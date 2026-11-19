package pp202602.midterm1

import IList.*

/**
  * Problem 1 (15 points): Zig-zag merge
  *
  * Implement `zigzip`, which receives two `IList`s containing elements of the
  * same type and returns one `IList` formed by alternating their elements.
  * The first element must come from `l1`, the second from `l2`, and so on.
  *
  * If one input list ends, append the remaining elements of the other list
  * in their original order.
  * For example:
  *
  *   zigzip(ICons(1, ICons(2, INil)), ICons(10, ICons(20, ICons(30, INil))))
  *   == ICons(1, ICons(10, ICons(2, ICons(20, ICons(30, INil)))))
  *
  * You may assume that each input list has at most 1,000 elements.
  *
  * Do not use mutable variables, iteration syntax, or library collection
  * transformations such as mapping, folding, reducing, or zipping.
  */
object Midterm1:
  def zigzip[A](l1: IList[A], l2: IList[A]): IList[A] = ???
