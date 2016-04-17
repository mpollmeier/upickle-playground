name := "upickle-playground"
scalaVersion := "2.11.8"
// scalacOptions += "-Xlog-implicits"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "upickle" % "0.3.9",
  "org.scalatest" %% "scalatest" % "2.2.5" % Test
)

