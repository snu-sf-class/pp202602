// Reference solution.
// To test it, replace Main.scala with this file and rename Midterm2Solution to Midterm2.

package pp202602.midterm2

object Midterm2Solution:
  class MyClass[A, B, C, D, E, F]():
    type Record1 = {
      val a: A
      val b: { val x: B; val y: C }
      val c: D
    }

    type Record2 = {
      val c: D
      val extra: E
      val b: { val y: C; val x: B; val z: F }
      val a: A
    }

    type CommonTy1 = {
      val a: A
      val b: { val x: B; val y: C }
      val c: D
    }

    type Tuple1 = (A, { val x: B; val y: C })
    type Tuple2 = (A, { val x: B; val z: D })

    type CommonTy2 = (A, { val x: B })

    class Class1(val value: F)
    class Class2(val value: F)

    type Func1 = {
      val data: A
      val c: Class1
      val f: { val x: B; val y: C } => { val r: D }
    }
    type Func2 = {
      val data: A
      val c: Class2
      val f: { val x: B } => { val r: D; val s: E }
    }

    /** For `CommonTy3`, we accept either of the following answers.
    *  - dropping `c`
    *  - typing `c` as `Object` or `{ val value: F }`
    */
    type CommonTy3 = {
      val data: A
      val c: { val value: F }
      val f: { val x: B; val y: C } => { val r: D }
    }
