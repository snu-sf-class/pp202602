// Reference solution.
// To test it, replace Main.scala with this file, rename Midterm4Solution to Midterm4,
// and delete the inner `Expr` trait.

package pp202602.midterm4

object Midterm4Solution:
  // Same as `Expr` in Data.scala.
  // Not needed once this object is renamed to Midterm4.
  trait Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R

  trait ExprVisitor[T, R]:
    def visitNum(value: T): R
    def visitAdd(left: Expr[T], right: Expr[T]): R
    def visitSub(left: Expr[T], right: Expr[T]): R
    def visitMul(left: Expr[T], right: Expr[T]): R
    def visitDiv(left: Expr[T], right: Expr[T]): R

  class Num[T](val value: T) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = visitor.visitNum(value)

  class Add[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = visitor.visitAdd(left, right)

  class Sub[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = visitor.visitSub(left, right)

  class Mul[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = visitor.visitMul(left, right)

  class Div[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = visitor.visitDiv(left, right)

  class EvalVisitor[T](
      val add: (T, T) => T,
      val sub: (T, T) => T,
      val mul: (T, T) => T,
      val div: (T, T) => T
  ) extends ExprVisitor[T, T]:
    def visitNum(value: T): T = value
    def visitAdd(left: Expr[T], right: Expr[T]): T = add(left.accept(this), right.accept(this))
    def visitSub(left: Expr[T], right: Expr[T]): T = sub(left.accept(this), right.accept(this))
    def visitMul(left: Expr[T], right: Expr[T]): T = mul(left.accept(this), right.accept(this))
    def visitDiv(left: Expr[T], right: Expr[T]): T = div(left.accept(this), right.accept(this))

  class CountNodeVisitor[T] extends ExprVisitor[T, Int]:
    def visitNum(value: T): Int = 1
    def visitAdd(left: Expr[T], right: Expr[T]): Int = 1 + left.accept(this) + right.accept(this)
    def visitSub(left: Expr[T], right: Expr[T]): Int = 1 + left.accept(this) + right.accept(this)
    def visitMul(left: Expr[T], right: Expr[T]): Int = 1 + left.accept(this) + right.accept(this)
    def visitDiv(left: Expr[T], right: Expr[T]): Int = 1 + left.accept(this) + right.accept(this)

  class CountNumVisitor[T] extends ExprVisitor[T, Int]:
    def visitNum(value: T): Int = 1
    def visitAdd(left: Expr[T], right: Expr[T]): Int = left.accept(this) + right.accept(this)
    def visitSub(left: Expr[T], right: Expr[T]): Int = left.accept(this) + right.accept(this)
    def visitMul(left: Expr[T], right: Expr[T]): Int = left.accept(this) + right.accept(this)
    def visitDiv(left: Expr[T], right: Expr[T]): Int = left.accept(this) + right.accept(this)
