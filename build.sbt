name := """play-oauth2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  ws,
  "ws.securesocial" %% "securesocial" % "master-SNAPSHOT",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  // Client dependencies
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "jquery" % "1.11.2"
)
