name := """scalaSerializers"""

lazy val commonSettings = Seq(
	organization := "com.github.uryyyyyyy",
	scalaVersion := "2.11.7",
	libraryDependencies ++= Seq(
		"org.scalatest" %% "scalatest" % "3.0.0-M15" % "test"
	)
)

lazy val message_pack = (project in file("message_pack")).
		settings(commonSettings: _*)

lazy val json = (project in file("json")).
		settings(commonSettings: _*)

lazy val xml = (project in file("xml")).
		settings(commonSettings: _*)
