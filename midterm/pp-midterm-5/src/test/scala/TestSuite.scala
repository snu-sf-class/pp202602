package pp202602.midterm5

import scala.annotation.tailrec
import IntExpr.*
import Midterm5.eval

class EvalSuite extends munit.FunSuite:
  test("5-1: eval correctly evaluates expressions"):
    assertEquals(eval(Num(2)), 2)
    assertEquals(eval(Add(Num(2), Mul(Num(3), Num(4)))), 14)
    assertEquals(eval(Sub(Mul(Num(8), Num(3)), Add(Num(4), Num(5)))), 15)

class DeepEvalSuite extends munit.FunSuite:
  test("5-2: eval handles a deeply nested expression"):
    @tailrec
    def deep(n: Int, expression: IntExpr): IntExpr =
      if n == 0 then expression else deep(n - 1, Add(Num(1), expression))

    assertEquals(eval(deep(1000000, Num(0))), 1000000)
