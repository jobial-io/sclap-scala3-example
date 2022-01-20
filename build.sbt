
lazy val root = project
  .in(file("."))
  .settings(
    name := "slap-scala3-example",
    version := "1.3.0",
    scalaVersion := "3.1.0",
    libraryDependencies ++= Seq(
      "io.jobial" % "sclap-app_2.13" % "1.3.0" % "compile->compile;test->test"
    )
  )
