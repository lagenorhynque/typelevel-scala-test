lazy val root = (project in file("."))
  .settings(
    name := "typelevel-scala-test",
    version := "0.1.0",
    scalaVersion := "2.12.1",
    scalaOrganization in ThisBuild := "org.typelevel",
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint", "-Yliteral-types", "-Xstrict-patmat-analysis", "-Xlint:strict-unsealed-patmat"),
    libraryDependencies ++= Seq()
  )
