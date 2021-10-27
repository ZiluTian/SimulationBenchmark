import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organizationName := "example"

val paradiseVersion = "2.1.0"
run / fork := true

lazy val squidSettings = Seq(
  autoCompilerPlugins := true,
  addCompilerPlugin(
    "org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full
  ),
  unmanagedBase := (unmanagedBase in LocalRootProject).value
)

lazy val root = (project in file("."))
  .settings(
    name := "example", 
    squidSettings,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.4.20",
  )

lazy val generated = (project in file("generated"))
  .settings(
    name := "example", 
    libraryDependencies += scalaTest % Test,
  ).dependsOn(root)