organization := "com.miriamlaurel"

name := "fxcore"

version := "2.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.3",
  "org.joda" % "joda-convert" % "1.2",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation", "-feature")

publishTo := Some("Repository Archiva Managed development Repository" at "http://miriamlaurel.com:8080/archiva/repository/internal/")

credentials += Credentials(Path.userHome / ".sbt" / ".archiva_credentials")