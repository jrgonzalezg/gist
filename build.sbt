name := "hablapps"

scalaVersion := "2.11.8"

scalaOrganization := "org.typelevel"

scalaBinaryVersion := "2.11"

organization := "org.hablapps"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.0")

resolvers ++= Seq(
  "Speech repo - releases" at "http://repo.hablapps.com/releases")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.7.2",
  "org.scalaz" %% "scalaz-core" % "7.3.0-M4-HABLAPPS",
  "org.scalatest" %% "scalatest" % "3.0.0",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
  "com.lihaoyi" %% "sourcecode" % "0.1.2"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Ypartial-unification",
  // "-Xprint:typer",
  // "-Xlog-implicit-conversions",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds")

initialCommands in console := """
  |import org.hablapps.gist._
  """.stripMargin
