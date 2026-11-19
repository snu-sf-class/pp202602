/// !!! DO NOT MODIFY THIS FILE !!!

package pp202602.midterm5

/** Arithmetic integer expressions. */
enum IntExpr:
  case Num(value: Int)
  case Add(left: IntExpr, right: IntExpr)
  case Sub(left: IntExpr, right: IntExpr)
  case Mul(left: IntExpr, right: IntExpr)
