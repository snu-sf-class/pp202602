// Reference solution, with an alternative solution in Midterm5SolutionAlt1.
// To test it, replace Main.scala with this file and rename Midterm5Solution (or Midterm5SolutionAlt1) to Midterm5.

package pp202602.midterm5

import scala.annotation.tailrec
import scala.util.control.TailCalls.*
import IntExpr.*

private enum Operator:
  case Add
  case Sub
  case Mul

  def apply(left: Int, right: Int): Int =
    this match
      case Operator.Add => left + right
      case Operator.Sub => left - right
      case Operator.Mul => left * right

/** Standard approach: represent the remaining work (continuation) as an
  * algebraic data type, so that the tail-recursive function performs one
  * evaluation step at a time and passes the updated work along.
  */
object Midterm5Solution:
  /** The continuation representing all remaining work to compute the given
    * expression. Receives the value of the expression just evaluated and yields
    * the final result.
    */
  private enum Cont:
    // Returns the received value as the final result.
    case Done
    // Receives the `left` value, evaluates `right`, and then transitions to `ApplyOp`.
    case EvalRight(op: Operator, right: IntExpr, next: Cont)
    // Receives the `right` value, applies `op` with the already computed `left`, and passes the result to `next`.
    case ApplyOp(op: Operator, left: Int, next: Cont)

  def eval(expr: IntExpr): Int =
    @tailrec
    def evalThen(expr: IntExpr, cont: Cont): Int =
      expr match
        case Add(left, right) =>
          evalThen(left, Cont.EvalRight(Operator.Add, right, cont))
        case Sub(left, right) =>
          evalThen(left, Cont.EvalRight(Operator.Sub, right, cont))
        case Mul(left, right) =>
          evalThen(left, Cont.EvalRight(Operator.Mul, right, cont))
        case Num(value) =>
          cont match
            case Cont.Done                       => value
            case Cont.EvalRight(op, right, next) =>
              evalThen(right, Cont.ApplyOp(op, value, next))
            case Cont.ApplyOp(op, left, next) =>
              evalThen(Num(op(left, value)), next)

    evalThen(expr, Cont.Done)

/** Alternative 1: represent the continuation as a TailRec function.
  */
object Midterm5SolutionAlt1:
  private type Cont = Int => TailRec[Int]

  def eval(expr: IntExpr): Int =
    def evalThen(expr: IntExpr, cont: Cont): TailRec[Int] =
      expr match
        case Num(value)       => tailcall(cont(value))
        case Add(left, right) => evalBinThen(Operator.Add, left, right, cont)
        case Sub(left, right) => evalBinThen(Operator.Sub, left, right, cont)
        case Mul(left, right) => evalBinThen(Operator.Mul, left, right, cont)

    def evalBinThen(
        op: Operator,
        left: IntExpr,
        right: IntExpr,
        cont: Cont
    ): TailRec[Int] =
      tailcall(
        evalThen(
          left,
          lv => tailcall(evalThen(right, rv => tailcall(cont(op(lv, rv)))))
        )
      )

    evalThen(expr, value => done(value)).result
