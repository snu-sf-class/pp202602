val scala3Version = "3.3.9"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pp202602-midterm-5",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29",
    Global / cancelable := true
  )
