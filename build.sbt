name := """scalajs-stacktrace"""

version := "0.1.0-SNAPSHOT"

val scalaVersion212 = "2.12.1"
val scalaVersion211 = "2.11.8"

scalaVersion in ThisBuild := scalaVersion211

crossScalaVersions in ThisBuild := Seq(scalaVersion212, scalaVersion211)

organization := "org.mdedetrich"

isScalaJSProject := true

jsDependencies ++= Seq(
  "org.webjars.npm" % "stacktrace-js" % "1.3.1" / "stacktrace.js"
)

enablePlugins(ScalaJSPlugin)
