name := """play-scala-seed"""
organization := "com.zeguro"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(PlayJava)

// unmanagedSourceDirectories in Compile += baseDirectory.value / "src"

scalaVersion := "2.12.7"

// libraryDependencies += guice
libraryDependencies ++= Seq(
  guice,
  jdbc,
  "org.scalatestplus.play"        %% "scalatestplus-play"       % "3.1.2" % Test,
  "com.typesafe.play"             %% "play-jdbc-evolutions"     % "2.6.20",
  "com.google.code.gson"          %  "gson"                     % "2.8.5",
  "org.postgresql"                %  "postgresql"               % "42.2.5"
)

// libraryDependencies += "org.danilopianini"      % "gson-extras" % "0.2.1"
// libraryDependencies += "javax.activation"       % "activation" % "1.1.1"
// libraryDependencies += "ro.pippo"               % "pippo-core" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-controller" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-freemarker" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-jackson" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-fastjson" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-jetty" % "1.7.0"
// libraryDependencies += "ro.pippo"               % "pippo-gson" % "1.7.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.zeguro.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.zeguro.binders._"
