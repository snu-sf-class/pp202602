/// !!! DO NOT MODIFY THIS FILE !!!

package pp202602.midterm1

enum IList[+A]:
  case INil
  case ICons(head: A, tail: IList[A])
