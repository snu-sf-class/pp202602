# Principles of Programming Midterm

Implement `stream` in `src/main/scala/Main.scala`, which is currently left blank as `???`.

**WARNING: Please read the restrictions below carefully.**

If you do not follow these, **your submission will not be graded.**

- Only edit `src/main/scala/Main.scala`. **DO NOT MODIFY `Data.scala`.**
- Do not use the keyword `var`. Use `val` and `def` instead.
- Do not use any library functions or data structures like `List`, `Array`, `Range` (`1 to n`, `1 until n` ...), `fold`, `map`, `reduce`, etc.
- You can only use tuples, `scala.annotation.tailrec`, and `scala.util.control.TailCalls._` from the library.
- If you want to use a data structure, create a new one instead of using the library ones.
- Do not use any looping syntax of Scala (`for`, `while`, `yield`, ...)
- Follow the additional restrictions written in the comments of `Main.scala`.

Again, your score will be zero if you do not follow these rules.

Timeout: 30 sec.

## Link

- [Coder](https://sfexam.snu.ac.kr:9094)
- [GitLab](https://sfexam.snu.ac.kr:9092)

## Testing Your Code

1. Navigate to the Coder platform.
2. Launch `code-server`.
3. Open a terminal within the IDE.
4. In the terminal, enter the following commands to open separate coding environments for each problem:
   - `code pp-midterm-1`
   - `code pp-midterm-2`
   - `code pp-midterm-3`
   - `code pp-midterm-4`
   - `code pp-midterm-5`
5. Test your code by running `sbt test` in each problem's terminal.

## Submitting Your Code

1. Copy your solution from Coder.
2. Access the GitLab editor using the URL provided in `ACCESS_CODE_EDIT.md`.
3. Paste your solution into the editor and commit it.
4. Your grade is based on the last commit in the `main` branch before the
   deadline. Commit frequently and verify your commits on GitLab.
