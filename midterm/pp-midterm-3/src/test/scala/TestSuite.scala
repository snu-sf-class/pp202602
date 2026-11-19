package pp202602.midterm3

import munit.FunSuite

class FibonacciValuesSuite extends FunSuite:
  test("the stream has the required Fibonacci values"):
    assertEquals(Midterm3.stream(0), 0)
    assertEquals(Midterm3.stream(1), 1)
    assertEquals(Midterm3.stream(2), 1)
    assertEquals(Midterm3.stream(7), 13)
    assertEquals(Midterm3.stream(10), 55)
    assertEquals(Midterm3.stream(46), 1836311903)

class SuffixReuseSuite extends FunSuite:
  test("previously created suffixes are reused"):
    @scala.annotation.tailrec
    def at(stream: IStream[Int], index: Int): IStream[Int] =
      if index == 0 then stream else at(stream.tail, index - 1)

    assert(at(Midterm3.stream, 1000) eq at(Midterm3.stream, 1000))
