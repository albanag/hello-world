name := """hello-world"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.5"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.7",
  test in assembly := {}
)

lazy val hello = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("nl.example.WebServer")
  )