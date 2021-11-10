ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organizationName := "example"

val project_name = "TickTalkBenchmark"
val paradiseVersion = "2.1.0"
val breezeVersion = "0.13.2"
val akkaVersion = "2.6.14"
val scalaTestVersion = "3.0.0"

run / fork := true

lazy val runAll = taskKey[Unit]("run-all, for compiling all meta examples")

def runAllIn(config: Configuration) = Def.task {
    val s = streams.value
    val cp = (config / fullClasspath).value
    val r = (run / runner).value
    (config / discoveredMainClasses).value.foreach(c =>
      r.run(c, cp.files, Seq(), s.log))
}

lazy val commonSettings = Seq(
  libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
  libraryDependencies += "org.scalanlp" %% "breeze" % breezeVersion,
  libraryDependencies += "org.scalanlp" %% "breeze-natives" % breezeVersion,
  libraryDependencies += "org.scalanlp" %% "breeze-viz" % breezeVersion,
)

lazy val akkaSettings = Seq(
  libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
  libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
)

lazy val squidSettings = Seq(
  autoCompilerPlugins := true,
  addCompilerPlugin(
    "org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full
  ),
  unmanagedBase := (unmanagedBase in LocalRootProject).value
)

lazy val example = (project in file("."))
  .settings(
    name := f"${project_name}-example", 
    squidSettings, commonSettings,
    autoCompilerPlugins := true,
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.4.20",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    libraryDependencies += "de.sciss" %% "coroutines" % "0.1.0",
    runAll := runAllIn(Compile).value,
    Test / parallelExecution := false,
  )

lazy val genExample = (project in file("generated"))
  .settings(
    name := f"${project_name}-genExample",
    Test / parallelExecution := false,
    commonSettings, akkaSettings,
  )
  .dependsOn(example)