package pp202602.midterm4

import munit.FunSuite
import Midterm4.*

class TestSuite extends FunSuite:
  private val intEval = new EvalVisitor[Int](
    (x, y) => x + y,
    (x, y) => x - y,
    (x, y) => x * y,
    (x, y) => x / y
  )

  private val doubleEval = new EvalVisitor[Double](
    (x, y) => x + y,
    (x, y) => x - y,
    (x, y) => x * y,
    (x, y) => x / y
  )

  private val intCountNode = new CountNodeVisitor[Int]
  private val intCountNum = new CountNumVisitor[Int]

  test("the evaluation visitor computes values"):
    val expr1: Expr[Int] = new Num(2)
    val expr2: Expr[Int] = new Add(new Num(2), new Mul(new Num(3), new Num(4)))
    val expr3: Expr[Int] = new Div(new Sub(new Num(10), new Num(3)), new Num(2))
    val expr4: Expr[Double] = new Sub(new Num(10.5), new Num(4.5))
    assertEquals(expr1.accept(intEval), 2)
    assertEquals(expr2.accept(intEval), 14)
    assertEquals(expr3.accept(intEval), 3)
    assertEquals(expr4.accept(doubleEval), 6.0)

  test("the counting visitors count nodes"):
    val expr1: Expr[Int] = new Add(new Num(2), new Mul(new Num(3), new Num(4)))
    val expr2: Expr[Int] = new Div(new Sub(new Num(10), new Num(3)), new Num(2))
    assertEquals(expr1.accept(intCountNode), 5)
    assertEquals(expr1.accept(intCountNum), 3)
    assertEquals(expr2.accept(intCountNode), 5)
    assertEquals(expr2.accept(intCountNum), 3)
