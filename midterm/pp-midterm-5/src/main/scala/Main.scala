package pp202602.midterm5

/**
  * Problem 5 (30 points): Integer expression evaluation
  *
  * The integer arithmetic expression `IntExpr` is defined as an algebraic
  * data type in `Data.scala`. Implement the `eval` function, which evaluates
  * an expression to an integer.
  *
  * Both 5-1 and 5-2 are graded on the same `eval` function.
  *
  * 5-1 (10 points): implement `eval` so that it correctly evaluates `IntExpr` expressions.
  * 5-2 (20 points): implement `eval` using tail-recursive functions, so that
  *                  it evaluates deeply nested expressions without overflowing the JVM
  *                  call stack.
  *
  * Do not use `var`, loops, or standard-library collections. If you use
  * `TailCalls`, do not use `map` or `flatMap` on `TailRec`.
  */
object Midterm5:
  def eval(expr: IntExpr): Int = ???
