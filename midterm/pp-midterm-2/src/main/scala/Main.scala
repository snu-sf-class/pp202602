package pp202602.midterm2

/**
  * Problem 2 (15 points): Structural Subtyping
  *
  * Find the **least** (i.e., most specific) common supertype of each pair.
  * We will check your answer by comparing it with our answer as follows:
  *
  * `checkType(Record1 <: CommonTy1 && Record2 <: CommonTy1 && CommonTy1 <: Answer1)`
  * `checkType(Tuple1 <: CommonTy2 && Tuple2 <: CommonTy2 && CommonTy2 <: Answer2)`
  * `checkType(Func1 <: CommonTy3 && Func2 <: CommonTy3 && CommonTy3 <: Answer3)`
  *
  * The provided tests only check that your answers are common supertypes,
  * not that they are the least ones.
  *
  * **Do not use `Any` or union types (`|`) anywhere in your code.**
  */
object Midterm2:
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

    // Replace `Nothing` with the least common supertype of Record1 and Record2.
    type CommonTy1 = Nothing

    type Tuple1 = (A, { val x: B; val y: C })
    type Tuple2 = (A, { val x: B; val z: D })

    // Replace `Nothing` with the least common supertype of Tuple1 and Tuple2.
    type CommonTy2 = Nothing

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

    // Replace `Nothing` with the least common supertype of Func1 and Func2.
    type CommonTy3 = Nothing
