package pp202602.midterm3

/**
  * Problem 3 (20 points): Infinite Fibonacci stream
  *
  * Define `stream` as a lazy, immutable infinite stream of Fibonacci numbers.
  * The sequence starts with 0 and 1:
  *
  *   stream(0) == 0
  *   stream(1) == 1
  *   stream(2) == 1
  *   stream(7) == 13
  *
  * `IStream` is supplied in `Data.scala`. You do not need to worry about
  * `Int` overflow.
  *
  * Requirements:
  *
  *   - Constructing `stream` must finish immediately; calculate later
  *     elements only when they are demanded.
  *   - Compute each element from the two preceding elements, not from
  *     scratch.
  *   - The already-created suffix must be reused when it is demanded again.
  *   - Do not use `var`, loops, or standard-library collections.
  */
object Midterm3:
  val stream: IStream[Int] = ???
