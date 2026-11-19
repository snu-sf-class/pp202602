/// !!! DO NOT MODIFY THIS FILE !!!

package pp202602.midterm4

import Midterm4.ExprVisitor

trait Expr[T]:
  def accept[R](visitor: ExprVisitor[T, R]): R
