package pp202602.midterm4

/**
  * Problem 4 (20 points): Object-oriented visitor
  *
  * An `Expr[T]` represents an arithmetic expression over a numeric type `T`.
  * An `ExprVisitor[T, R]` is an operation on `Expr[T]` producing `R`;
  * `e.accept(v)` runs `v` on `e`.
  *
  * Different visitors can be used to perform different operations on the
  * same expression. For example:
  *
  *   - An expression accepts an `EvalVisitor` to evaluate its value.
  *   - An expression accepts a `CountNodeVisitor` to count its nodes.
  *
  * Complete the definitions of `ExprVisitor`, the `Expr` subclasses, and the
  * example visitors.
  *
  * Restrictions:
  *
  *   - `accept` must be generic in the visitor: it must work for every
  *     `ExprVisitor`, not only for the three visitors below.
  *   - Do not use `match`, `isInstanceOf`, `asInstanceOf`, or any other
  *     runtime type test or cast.
  *   - Do not use an enum or standard-library collections.
  *   - Do not rename `ExprVisitor` or change its type parameters.
  */
object Midterm4:
  // Declare the visitor methods inside this trait.
  trait ExprVisitor[T, R]
    // def visitExample(...): R

  class Num[T](val value: T) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = ???

  class Add[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = ???

  class Sub[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = ???

  class Mul[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = ???

  class Div[T](val left: Expr[T], val right: Expr[T]) extends Expr[T]:
    def accept[R](visitor: ExprVisitor[T, R]): R = ???

  // Implement EvalVisitor. It returns the evaluated value of the visited
  // expression. The arithmetic operations are supplied as constructor arguments.
  class EvalVisitor[T](
      val add: (T, T) => T,
      val sub: (T, T) => T,
      val mul: (T, T) => T,
      val div: (T, T) => T
  ) extends ExprVisitor[T, T]

  // Implement CountNodeVisitor. It returns the number of expression nodes in
  // the visited expression.
  class CountNodeVisitor[T] extends ExprVisitor[T, Int]

  // Implement CountNumVisitor. It returns the number of Num nodes in the
  // visited expression.
  class CountNumVisitor[T] extends ExprVisitor[T, Int]
