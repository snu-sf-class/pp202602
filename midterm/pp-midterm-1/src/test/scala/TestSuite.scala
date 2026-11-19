package pp202602.midterm1

import munit.FunSuite
import IList.*
import Midterm1.zigzip

class TestSuite extends FunSuite:
  test("zigzip alternates elements, starting from l1"):
    assertEquals(
      zigzip(ICons(1, ICons(2, INil)), ICons(10, ICons(20, ICons(30, INil)))),
      ICons(1, ICons(10, ICons(2, ICons(20, ICons(30, INil)))))
    )
    assertEquals(
      zigzip(ICons(1, ICons(2, ICons(3, INil))), ICons(10, INil)),
      ICons(1, ICons(10, ICons(2, ICons(3, INil))))
    )

  test("zigzip handles empty lists"):
    assertEquals(zigzip[Int](INil, INil), INil)
    assertEquals(zigzip(ICons(1, INil), INil), ICons(1, INil))
    assertEquals(zigzip(INil, ICons(10, INil)), ICons(10, INil))
