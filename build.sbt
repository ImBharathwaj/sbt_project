scalaVersion := "2.13.8"
version := "1.0"

name := "Dominate"
organization := "com.tamaai"

libraryDependencies ++= Seq(
	"com.lihaoyi" %% "fansi" % "0.4.0",
	"org.scalatest" %% "scalatest" % "3.2.13" % Test
)
