lazy val sunblock = (project in file("sunblock")).settings(
  organization := "tf.bug",
  name := "sunblock",
  version := "0.1.0",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "ba.sake" %% "hepek" % "0.2.0",
    "com.github.japgolly.scalacss" %% "core" % "0.5.5",
  ),
  (hepek in Compile) := {
    WebKeys.assets.value
    (hepek in Compile).value
  },
  WebKeys.webModulesLib := "site/lib",
  git.remoteRepo := "https://github.com/sorenbug/sunblock.git",
  siteSourceDirectory := target.value / "web" / "public" / "main" / "site",
).enablePlugins(SbtWeb, HepekPlugin, GhpagesPlugin)
