# Principles of Programming Assignment 4A

## Objective

Implement the instances and functions in `src/main/scala/Main.scala`, which are currently left blank as `???`

**For pedagogical purposes, we highly recommend following the restrictions below.**

- **DO NOT FIX Data.scala**
- Do not use the keyword `var`. Use `val` and `def` instead.
- Do not use any library functions or data structures like `List`, `Array`, `Range` (`1 to n`, `1 until n` ...), `fold`, `map`, `reduce` or etc.
- You can only use tuples, `scala.annotation.tailrec`, `scala.util.control.TailCalls._`, and `List`, `Nil`, `Cons` (to implement `toList` function) from the library.
- If you want to use a data structure, create new one instead of using the library ones.
- Do not use any looping syntax of Scala (`for`, `while`, `do-while`, `yield`, ...)

We do not require tail-recursion explicitly for this assignment.

Timeout: 30 sec.

## How to test your code

```bash
sbt test # compile and run TestSuite.scala
```

If `sbt test` does not work, then your code is wrong.

Fix your code until it works, or send a question to the TA.
