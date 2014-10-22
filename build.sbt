name := "scalafxml-unit-converter-example"

version := "1.0"

scalaVersion := "2.11.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies ++= List(
  "org.scalafx" %% "scalafx" % "8.0.20-R6",
  "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"
)

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)
