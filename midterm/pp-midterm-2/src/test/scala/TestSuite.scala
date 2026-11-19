import pp202602.midterm2.Midterm2
import scala.compiletime.testing.typeChecks

class TestSuite extends munit.FunSuite:
  val mc = new Midterm2.MyClass[Int, Boolean, Unit, Float, (Int, Int), (Int, Int, Int)]()

  test("CommonTy1 is a common supertype of Record1 and Record2"):
    assert(typeChecks("summon[mc.Record1 <:< mc.CommonTy1]"))
    assert(typeChecks("summon[mc.Record2 <:< mc.CommonTy1]"))

  test("CommonTy2 is a common supertype of Tuple1 and Tuple2"):
    assert(typeChecks("summon[mc.Tuple1 <:< mc.CommonTy2]"))
    assert(typeChecks("summon[mc.Tuple2 <:< mc.CommonTy2]"))

  test("CommonTy3 is a common supertype of Func1 and Func2"):
    assert(typeChecks("summon[mc.Func1 <:< mc.CommonTy3]"))
    assert(typeChecks("summon[mc.Func2 <:< mc.CommonTy3]"))
